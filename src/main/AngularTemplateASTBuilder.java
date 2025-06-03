import antlr.AngularTemplateParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class AngularTemplateASTBuilder {

    private AngularTemplateParser parser;
    private ParseTree parseTree;
    private ASTNode ASTTree;
    private String[] ignoreTokens = {
            "<", ">", "/", "{", "}", "(", ")", ":", ",", ".", "`", ";", "[", "]", "$", "@", "|", "&", "="
    };

    public AngularTemplateASTBuilder(AngularTemplateParser parser, ParseTree tree) {
        this.parseTree = tree;
        this.parser = parser;
        this.ASTTree = buildAST(parseTree);
    }

    private ASTNode buildAST(ParseTree node) {
        if (node instanceof TerminalNode) {
            if (Arrays.asList(ignoreTokens).contains(node.getText())) return null;
            return new ASTNode(parser.getVocabulary().getSymbolicName(((TerminalNode) node).getSymbol().getType()), node.getText());
        }

        int ruleIndex = ((RuleContext) node).getRuleIndex();
        String ruleName = parser.getRuleNames()[ruleIndex];

        if (node.getChildCount() == 1) {
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

    public void printASTTree() {
        if (ASTTree != null) {
            ASTTree.printSubTree("", true);
        } else {
            System.out.println("AST is empty.");
        }
    }

}
