import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class AngularASTBuilder {

    private AngularParser parser;
    private AngularLexer lexer;
    private ParseTree parseTree;
    private ASTNode ASTTree;
    private Map<String, SymbolInfo> symbolTable;
    private String[] ignoreTokens = {
            "{",
            "}",
            "(",
            ")",
            ":",
            ",",
            ".",
            "`",
            ";",
            "[",
            "]",
            "$",
            "@",
            "|",
            "&",
            "="
    };

    private String[] dontSkip = {
            "parameterList", "argumentList"
    };

    public AngularASTBuilder(AngularLexer lexer, AngularParser parser, ParseTree tree) {
        this.parseTree = tree;
        this.parser = parser;
        this.lexer = lexer;
        this.symbolTable = new HashMap<>();
        this.ASTTree = buildAST(parseTree);
        buildSymbolTable(this.parseTree, "global");
    }

    private void addSymbol(String name, String type, String scope, String value) {
        if (!symbolTable.containsKey(name)) {
            symbolTable.put(name, new SymbolInfo(type, scope, value));
        } else {
            System.out.println("Error: Duplicate symbol detected: " + name);
        }
    }

    private ASTNode buildAST(ParseTree node) {
        if (node instanceof TerminalNode) {
            if (Arrays.asList(ignoreTokens).contains(node.getText())) return null;
            return new ASTNode(parser.getVocabulary().getSymbolicName(((TerminalNode) node).getSymbol().getType()), node.getText());
        }

        int ruleIndex = ((RuleContext) node).getRuleIndex();
        String ruleName = parser.getRuleNames()[ruleIndex];

        if (node.getChildCount() == 1 && !Arrays.asList(dontSkip).contains(ruleName)) {
            return buildAST(node.getChild(0));
        }

        ASTNode currentASTNode = new ASTNode(ruleName, null);

        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            ASTNode childAST = buildAST(child);
            if (childAST != null)
                currentASTNode.addChild(childAST);
        }

        return currentASTNode;
    }

    private void buildSymbolTable(ParseTree node, String scope) {
        if (node == null) return;

        // Identify the type of the parse tree node using its rule index
        if (!(node instanceof RuleContext)) return;

        int ruleIndex = ((RuleContext) node).getRuleIndex();
        String ruleName = parser.getRuleNames()[ruleIndex];

        switch (ruleName) {
            case "variableDeclaration", "propertyDeclaration" -> {
                String varName = getName(node); // Use utility function
                String varType = getType(node);       // Use utility function
                String value = "undefined";
                if (getChild(node, "expression") != null)
                    value = getChild(node, "expression").getText();
                addSymbol(varName, varType, scope, value);
            }
            case "functionDefinition", "methodDefinition" -> {
                String funcName = getName(node); // Use utility function
                String funcType = getType(node);       // Use utility function

                addSymbol(funcName, funcType, scope, "Function-Body");

                ParseTree parameterList = getChild(node, "parameterList"); // Use utility function
                if (parameterList != null) {
                    for (int i = 0; i < parameterList.getChildCount(); i++) {
                        ParseTree param = parameterList.getChild(i);
                        String paramName = getName(param); // Use utility function
                        String paramType = getType(param);       // Use utility function
                        addSymbol(paramName, paramType, "Function: " + funcName, "");
                    }
                }
            }
            case "classDefinition" -> {
                String className = getName(node); // Use utility function
                addSymbol(className, "class", scope, "Class-Body");

                ParseTree classBody = getChild(node, "classBody"); // classBody is last before '}'
                for (int i = 0; i < classBody.getChildCount(); i++) {
                    buildSymbolTable(classBody.getChild(i), "Class: " + className);
                }
            }
            case "constructorDeclaration" -> {
                // Add the constructor itself as a symbol
                addSymbol("constructor", "constructor", scope, "Function-Body");

                // Extract parameters and add them to the symbol table
                ParseTree parameterList = getChild(node, "parameterList");
                if (parameterList != null) {
                    for (int i = 0; i < parameterList.getChildCount(); i++) {
                        ParseTree param = parameterList.getChild(i);
                        String paramName = getName(param); // Use utility function
                        String paramType = getType(param);       // Use utility function
                        addSymbol(paramName, paramType, "Constructor", "");
                    }
                }
            }
            case "typeDefinition" -> {
                String typeName = getName(node);
                addSymbol(typeName, "Type", scope, "Type-Body");
            }
            default -> {
                for (int i = 0; i < node.getChildCount(); i++) {
                    buildSymbolTable(node.getChild(i), scope);
                }
            }
        }
    }


    private String getName(ParseTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            if (child instanceof TerminalNode) { // TerminalNode represents tokens
                if (((TerminalNode) child).getSymbol().getType() == this.lexer.ID) {
                    return child.getText(); // Return the text of the identifier
                }
            }
        }
        return null; // Identifier not found
    }


    private String getType(ParseTree node) {
        for (int i = 0; i < node.getChildCount(); i++) {
            if (node.getChild(i).getText().equals(":")) { // Look for a colon (':')
                return node.getChild(i + 1).getText(); // Type should follow the colon
            }
        }
        return "any"; // Default type
    }

    private ParseTree getChild(ParseTree node, String childRuleName) {
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            if (child instanceof RuleContext &&
                    parser.getRuleNames()[((RuleContext) child).getRuleIndex()].equals(childRuleName)) {
                return child; // Return the parameter list node
            }
        }
        return null; // No parameter list found
    }


    public void printSymbolTable() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BOLD = "\u001B[1m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_GREEN = "\u001B[32m";  // For the Identifier column
        final String ANSI_YELLOW = "\u001B[33m"; // For the Type column
        final String ANSI_MAGENTA = "\u001B[35m"; // For the Scope column
        final String ANSI_RED = "\u001B[31m";    // For the Value column

// Print the table header with colors
        System.out.println(ANSI_BOLD + ANSI_BLUE + "Symbol Table:" + ANSI_RESET);
        System.out.printf(
                ANSI_CYAN + "%-30s%-25s%-30s%-35s\n",
                "Identifier", "Type", "Scope", "Value"
        );
        System.out.println(ANSI_CYAN + "-".repeat(120) + ANSI_RESET); // Adjusted width for columns

// Print table rows with different colors for each column
        for (Map.Entry<String, SymbolInfo> entry : symbolTable.entrySet()) {
            String identifier = entry.getKey();
            SymbolInfo symbolInfo = entry.getValue();

            String type = symbolInfo.getType();
            String scope = symbolInfo.getScope();
            String value = symbolInfo.getValue();

            // Apply different colors for each column
            System.out.printf(
                    ANSI_GREEN + "%-30s" +
                            ANSI_YELLOW + "%-25s" +
                            ANSI_MAGENTA + "%-30s" +
                            ANSI_RED + "%-35s\n",
                    identifier, type, scope, value
            );
        }
    }

    public void printASTTree() {
        ASTTree.printSubTree("", true);
    }

    private class SymbolInfo {
        private String type;
        private String scope;
        private String value;

        public SymbolInfo(String type, String scope, String value) {
            this.type = type;
            this.scope = scope;
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public String getScope() {
            return scope;
        }

        public String getValue() {
            return value;
        }
    }

}
