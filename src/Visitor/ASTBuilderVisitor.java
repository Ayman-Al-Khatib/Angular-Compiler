package Visitor;

import Exceptions.SemanticErrorCollector;
import Exceptions.SemanticException;
import SymbolTables.FunctionSymbolTable;
import SymbolTables.SymbolTable;
import SymbolTables.VariableSymbolTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import AST.nodes.ClassDefinition.*;
import AST.nodes.Expression.*;
import AST.nodes.Expression.LogicalExpression.*;
import AST.nodes.LoopStatement.WhileLoop;
import AST.nodes.ServiceDefintion.ServiceDecorator;
import AST.nodes.ServiceDefintion.ServiceDefinition;
import AST.nodes.StringArray;
import AST.nodes.*;
import AST.nodes.AssignmentStatement.AssignmentStatement;
import AST.nodes.ComponentDefinition.ComponentDecorator;
import AST.nodes.ComponentDefinition.ComponentDefinition;
import AST.nodes.Expression.FunctionInvocation.ArgumentList;
import AST.nodes.Expression.FunctionInvocation.FunctionInvocation;
import AST.nodes.Expression.Object.ObjectExpression;
import AST.nodes.Expression.Object.ObjectProperty;
import AST.nodes.FunctionDefinition.*;
import AST.nodes.IfStatement.ElseBlock;
import AST.nodes.IfStatement.ElseIfBlock;
import AST.nodes.IfStatement.IfStatement;
import AST.nodes.ImportStatement.ImportMultiple;
import AST.nodes.ImportStatement.ImportSingle;
import AST.nodes.LoopStatement.ForLoopStatement;
import AST.nodes.Type.ArrayType;
import AST.nodes.Type.PrimitiveType;
import AST.nodes.Type.Type;
import AST.nodes.TypeDefinition.Interface;
import AST.nodes.TypeDefinition.InterfaceBody;
import AST.nodes.TypeDefinition.TypeAlias;
import AST.nodes.TypeDefinition.TypeBody;
import AST.nodes.VariableDecleration.VariableDecleration;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilderVisitor extends AngularParserBaseVisitor<ASTNode> {

    private String currentScope = "file";

    @Override
    public ASTNode visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();
        for (int i = 0; i < ctx.statement().size(); i++) {
            program.addStatement((Statement) visit(ctx.statement().get(i)));
        }
        return program;
    }

    @Override
    public ASTNode visitImportStmt(AngularParser.ImportStmtContext ctx) {
        return visit(ctx.importStatement());
    }

    @Override
    public ASTNode visitImportSingle(AngularParser.ImportSingleContext ctx) {

        SymbolTable.addSymbol(ctx.ID().getText(), "imported", currentScope, "Imported");
        return new ImportSingle(ctx.STRING().getText(),new Identifier(ctx.ID().getText()));
    }

    @Override
    public ASTNode visitImportMultiple(AngularParser.ImportMultipleContext ctx) {
        ImportMultiple obj = new ImportMultiple(ctx.STRING().getText());
        for (int i = 0; i < ctx.ID().size(); i++) {
            SymbolTable.addSymbol(ctx.ID(i).getText(), "imported", currentScope, "imported");
            obj.addChild(new Identifier(ctx.ID(i).getText()));
        }
        return obj;
    }

    @Override
    public ASTNode visitTypeDefStmt(AngularParser.TypeDefStmtContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public ASTNode visitTypeAliasDefStmt(AngularParser.TypeAliasDefStmtContext ctx) {
        return new TypeAlias(
                new Identifier(ctx.typeAliasDefinition().ID().getText()),
                (TypeBody) visit(ctx.typeAliasDefinition().typeBody())
        );
    }


    @Override
    public ASTNode visitTypeBody(AngularParser.TypeBodyContext ctx) {
        TypeBody body = new TypeBody();
        for(int i = 0; i  <ctx.ID().size(); i++) {
            body.addId(new Identifier(ctx.ID(i).getText()), (Type) visit(ctx.type(i)));
        }
        return body;
    }

    @Override
    public ASTNode visitVarDeclStmt(AngularParser.VarDeclStmtContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public ASTNode visitVarDeclWithTypeStmt(AngularParser.VarDeclWithTypeStmtContext ctx) {
        return visit(ctx.varDeclWithType());
    }

    @Override
    public ASTNode visitVarDeclWithType(AngularParser.VarDeclWithTypeContext ctx) {
        String keyword = ctx.getChild(0).getText(); // LET | CONST | VAR
        String id = ctx.ID().getText();
        String typeStr = ctx.type().getText();
        Expression expr = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        String valueStr = ctx.expression() != null ? ctx.expression().getText() : "undefined";
        int line = ctx.getStart().getLine();

        // check if the expression type and the var type are compatible
        if (expr != null) {
            String actualType = evaluateExpressionType(expr);
            System.out.println(actualType + "   " + typeStr);

            if (!typesAreCompatible(typeStr, actualType)) {
                SemanticErrorCollector.add(String.format(
                        "Line %d: Type mismatch: cannot assign '%s' to variable '%s' of declared type '%s'",
                        line, actualType, id, typeStr
                ));
            }
        }


        SymbolTable.addSymbol(id, typeStr, currentScope, valueStr);
        VariableSymbolTable.declareVariable(id, typeStr, valueStr, line);

        return new VariableDecleration(
                keyword,
                new Identifier(id),
                (Type) visit(ctx.type()),
                expr
        );
    }

    @Override
    public ASTNode visitVarDeclWithInitStmt(AngularParser.VarDeclWithInitStmtContext ctx) {
        return visit(ctx.varDeclWithInit());
    }

    @Override
    public ASTNode visitVarDeclWithInit(AngularParser.VarDeclWithInitContext ctx) {
        String keyword = ctx.getChild(0).getText(); // LET | CONST | VAR
        String id = ctx.ID().getText();
        Expression expr = ctx.expression() != null ? (Expression) visit(ctx.expression()) : null;
        String valueStr = ctx.expression() != null ? ctx.expression().getText() : "undefined";
        int line = ctx.getStart().getLine();

        String type = null;
        if (expr != null) type = evaluateExpressionType(expr); // derive the type from the expression

        SymbolTable.addSymbol(id, type, currentScope, valueStr);
        VariableSymbolTable.declareVariable(id, type, valueStr, line);

        return new VariableDecleration(
                keyword,
                new Identifier(id),
                null,
                expr
        );
    }

    private String evaluateExpressionType(Expression expr) {
        if (expr instanceof NumberLiteral) return "number";
        if (expr instanceof StringLiteral) return "string";
        if (expr instanceof BooleanLiteral) return "boolean";
        if (expr instanceof ArrayExpression) return "array";
        if (expr instanceof ObjectExpression) return "object";
        if (expr instanceof Identifier) return ((Identifier) expr).getName();
        return "any";
    }

    private boolean typesAreCompatible(String declaredType, String actualType) {
        if (declaredType.equals("any")) return true;
        if (declaredType.equals(actualType)) return true;
        if (declaredType.endsWith("[]") && actualType.equals("array")) return true;
        return false;
    }

    @Override
    public ASTNode visitFuncDefStmt(AngularParser.FuncDefStmtContext ctx) {

        return visit(ctx.getChild(0));
    }

    @Override
    public ASTNode visitFunctionDeclStmt(AngularParser.FunctionDeclStmtContext ctx) {
        var decl = ctx.functionDecl();

        VariableSymbolTable.enterScope();

        Identifier name = new Identifier(decl.ID().getText());
        ParameterList parameters = decl.parameterList() != null ? (ParameterList) visit(decl.parameterList()) : null;
        Type type = decl.type() != null ? (Type) visit(decl.type()) : null;
        FunctionBody body = (FunctionBody) visit(decl.functionBody());

        List<String> paramTypes = new ArrayList<>();
        if (parameters != null) {
            for (Parameter param : parameters.getParams()) {
                paramTypes.add(param.getType() != null ? param.getType().getText() : "any");
            }
        }

        VariableSymbolTable.exitScope();

        FunctionSymbolTable.addFunction(name.getName(), type != null ? type.getText() : "any", currentScope, "function-body", paramTypes);

        SymbolTable.addSymbol(decl.ID().getText(), type != null ? decl.type().getText() : "any" , currentScope, "function-body" );

        currentScope = "Function" + decl.ID().getText();

        return new FunctionDefinition(name, parameters, type, body);
    }



    @Override
    public ASTNode visitEmptyFunctionDeclStmt(AngularParser.EmptyFunctionDeclStmtContext ctx) {
        var decl = ctx.emptyFunctionDecl();

        VariableSymbolTable.enterScope();

        Identifier name = new Identifier(decl.ID().getText());
        ParameterList parameters = decl.parameterList() != null ? (ParameterList) visit(decl.parameterList()) : null;
        Type type = decl.type() != null ? (Type) visit(decl.type()) : null;

        List<String> paramTypes = new ArrayList<>();
        if (parameters != null) {
            for (Parameter param : parameters.getParams()) {
                paramTypes.add(param.getType() != null ? param.getType().getText() : "any");
            }
        }

        VariableSymbolTable.exitScope();

        FunctionSymbolTable.addFunction(name.getName(), type != null ? type.getText() : "any", currentScope, "function-body", paramTypes);

        SymbolTable.addSymbol(decl.ID().getText(), type != null ? type.getText() : "any", currentScope, "function-body");

        currentScope = "function" + name.getName();

        return new FunctionDefinition(name, parameters, type, null);
    }


    @Override
    public ASTNode visitArrowFunctionStmt(AngularParser.ArrowFunctionStmtContext ctx) {
        var decl = ctx.arrowFunction();

        VariableSymbolTable.enterScope();

        Identifier name = new Identifier(decl.ID().getText());
        ParameterList parameters = decl.parameterList() != null ? (ParameterList) visit(decl.parameterList()) : null;
        Type type = decl.type() != null ? (Type) visit(decl.type()) : null;
        FunctionBody body = (FunctionBody) visit(decl.functionBody());

        List<String> paramTypes = new ArrayList<>();
        if (parameters != null) {
            for (Parameter param : parameters.getParams()) {
                paramTypes.add(param.getType() != null ? param.getType().getText() : "any");
            }
        }

        VariableSymbolTable.exitScope();

        FunctionSymbolTable.addFunction(name.getName(), type != null ? type.getText() : "any", currentScope, "function-body", paramTypes);

        SymbolTable.addSymbol(decl.ID().getText(), type != null ? type.getText() : "any", currentScope, "function-body");

        currentScope = "function" + name.getName();

        return new FunctionDefinition(name, parameters, type, body);
    }


    @Override
    public ASTNode visitEmptyArrowFunctionStmt(AngularParser.EmptyArrowFunctionStmtContext ctx) {
        var decl = ctx.emptyArrowFunction();

        VariableSymbolTable.enterScope();

        Identifier name = new Identifier(decl.ID().getText());
        ParameterList parameters = decl.parameterList() != null ? (ParameterList) visit(decl.parameterList()) : null;
        Type type = decl.type() != null ? (Type) visit(decl.type()) : null;

        List<String> paramTypes = new ArrayList<>();
        if (parameters != null) {
            for (Parameter param : parameters.getParams()) {
                paramTypes.add(param.getType() != null ? param.getType().getText() : "any");
            }
        }

        VariableSymbolTable.exitScope();

        FunctionSymbolTable.addFunction(name.getName(), type != null ? type.getText() : "any", currentScope, "function-body", paramTypes);

        SymbolTable.addSymbol(decl.ID().getText(), type != null ? type.getText() : "any", currentScope, "function-body");

        currentScope = "function" + name.getName();

        return new FunctionDefinition(name, parameters, type, null);
    }


    @Override
    public ASTNode visitFunctionBody(AngularParser.FunctionBodyContext ctx) {
        ReturnStatement returnStatement;



        if (ctx.returnStatement() != null) returnStatement = (ReturnStatement) visit(ctx.returnStatement());
        else returnStatement = null;

        FunctionBody body =  new FunctionBody(returnStatement);
        for (int i = 0; i < ctx.statement().size(); i++) {
            body.addStatement((Statement) visit(ctx.statement(i)));
        }



        return body;
    }

    @Override
    public ASTNode visitReturnStmt(AngularParser.ReturnStmtContext ctx) {
        return new ReturnStatement((Expression) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitFuncInvokeStmt(AngularParser.FuncInvokeStmtContext ctx) {
        return visit(ctx.functionInvocation());
    }

    @Override
    public ASTNode visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionName fnName = (FunctionName) visit(ctx.functionName());
        System.out.println(fnName);
        String functionName = fnName.getBaseName();
        ArgumentList args = (ArgumentList) visit(ctx.argumentList());

        FunctionSymbolTable.FunctionSymbolEntry entry = FunctionSymbolTable.lookup(functionName);
        if (entry == null) {
            SemanticErrorCollector.add("Line " + ctx.getStart().getLine() + ": Undefined Function '" + fnName.getBaseName() + "'");
            return new FunctionInvocation(fnName, args);
        }


        int argCount = args != null ? args.getExpressions().size() : 0;
        int expectedCount = entry.paramTypes != null ? entry.paramTypes.size() : 0;

        if (argCount != expectedCount) {
            SemanticErrorCollector.add("Line " + ctx.getStart().getLine() + ": Function '" + functionName + "' expects " + expectedCount +
                    " arguments but got " + argCount + ".");
        }

        return new FunctionInvocation(fnName, args);
    }

    @Override
    public ASTNode visitFunctionNameExpr(AngularParser.FunctionNameExprContext ctx) {

        StringBuilder builder = new StringBuilder();

        if (ctx.THIS() != null) {
            builder.append(ctx.THIS().getText());
        }

        for (int i = 0; i < ctx.ID().size(); i++) {
            if (ctx.DOT(i) != null) builder.append(ctx.DOT(i).getText());
            builder.append(ctx.ID(i).getText());
        }

        return new FunctionName(new Identifier(builder.toString()));
    }

    @Override
    public ASTNode visitArguments(AngularParser.ArgumentsContext ctx) {
        ArgumentList list = new ArgumentList();
        for (int i = 0; i < ctx.expression().size(); i++) {
            list.addExp((Expression) visit(ctx.expression(i)));
        }
        return list;
    }

    @Override
    public ASTNode visitIfStatement(AngularParser.IfStatementContext ctx) {

        ElseBlock elseBlock = ctx.elseBlock() != null ? (ElseBlock) visit(ctx.elseBlock()) : null;

        IfStatement ifStatement =  new IfStatement((Expression) visit(ctx.expression()), (Statement) visit(ctx.statement()), elseBlock);
        for (int i = 0; i < ctx.elseIfBlock().size(); i++) {
            ifStatement.addElseIfBlock((ElseIfBlock) visit(ctx.elseIfBlock(i)));
        }
        return ifStatement;
    }

    @Override
    public ASTNode visitElseIfStmt(AngularParser.ElseIfStmtContext ctx) {
        return new ElseIfBlock((Expression) visit(ctx.expression()), (Statement) visit(ctx.statement()));
    }

    @Override
    public ASTNode visitElseStmt(AngularParser.ElseStmtContext ctx) {
        return new ElseBlock((Statement) visit(ctx.statement()));
    }

    @Override
    public ASTNode visitLoopStmt(AngularParser.LoopStmtContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public ASTNode visitForLoopStmt(AngularParser.ForLoopStmtContext ctx) {
        return visit(ctx.forLoop());
    }

    @Override
    public ASTNode visitForStmt(AngularParser.ForStmtContext ctx) {
        VariableDecleration initializer = ctx.forInitializer() != null ? (VariableDecleration) visit(ctx.forInitializer()) : null;
        Expression condition = ctx.forCondition() != null ? (Expression) visit(ctx.forCondition()) : null;
        Expression update = ctx.forUpdate() != null ? (Expression) visit(ctx.forUpdate()) : null;
        Statement body = ctx.statement() != null ?  (Statement) visit(ctx.statement()) : null;

        return new ForLoopStatement(initializer, condition, update, body);
    }

    @Override
    public ASTNode visitPostfixExpression(AngularParser.PostfixExpressionContext ctx) {
        Identifier id = new Identifier(ctx.getText());
        String operator = ctx.INCREMENT() != null ? "++" : ctx.DECREMENT() != null ? "--" : null;

        return new PostfixExpression(id, operator);
    }

    @Override
    public ASTNode visitPostFixExp(AngularParser.PostFixExpContext ctx) {
        return visit(ctx.postfixExpression());
    }

    @Override
    public ASTNode visitForVarInit(AngularParser.ForVarInitContext ctx) {
        return visit(ctx.variableDeclaration());
    }

    @Override
    public ASTNode visitForCond(AngularParser.ForCondContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitForUpdateExpr(AngularParser.ForUpdateExprContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public ASTNode visitStringLiteral(AngularParser.StringLiteralContext ctx) {
        return new StringLiteral(ctx.STRING().getText());
    }

    @Override
    public ASTNode visitNumberLiteral(AngularParser.NumberLiteralContext ctx) {
        return new NumberLiteral(ctx.NUMBER().getText());
    }

    @Override
    public ASTNode visitBooleanLiteral(AngularParser.BooleanLiteralContext ctx) {
        return new BooleanLiteral(ctx.BOOLEAN().getText() == "true" ? true : false);
    }

    @Override
    public ASTNode visitLogicalExpr(AngularParser.LogicalExprContext ctx) {
        return visit(ctx.logicalExpression());
    }

    @Override
    public ASTNode visitLogicalOpExpr(AngularParser.LogicalOpExprContext ctx) {
        LogicalExpression logicalExpression = new LogicalExpression();
        logicalExpression.addArithmeticExpression("", (ArithmeticExpression) visit(ctx.arithmeticExpression(0)));
        for (int i = 1; i < ctx.arithmeticExpression().size(); i++) {
            logicalExpression.addArithmeticExpression(ctx.getChild(i * 2 - 1).getText(), (ArithmeticExpression) visit(ctx.arithmeticExpression(i)));
        }
        return logicalExpression;
    }

    @Override
    public ASTNode visitArithmeticOpExpr(AngularParser.ArithmeticOpExprContext ctx) {
        ArithmeticExpression arithmeticExpression = new ArithmeticExpression();
        arithmeticExpression.addTerm("", (Term)  visit(ctx.term(0)));
        for (int i = 1; i < ctx.term().size(); i++) {
            arithmeticExpression.addTerm(ctx.termAction(i-1).getText() ,(Term) visit(ctx.term(i)));
        }
        return arithmeticExpression;
    }

    @Override
    public ASTNode visitTermOpExpr(AngularParser.TermOpExprContext ctx) {
        Term term =  new Term();
        term.addFactor("", (Factor) visit(ctx.factor(0)));
        for (int i = 1; i < ctx.factor().size(); i++) {
            term.addFactor(ctx.factor(i-1).getText(), (Factor) visit(ctx.factor(i).getChild(0)));
        }
        return term;
    }

    @Override
    public ASTNode visitNumberFactor(AngularParser.NumberFactorContext ctx) {
        return new NumberFactor(new NumberLiteral(ctx.NUMBER().getText()));
    }

    @Override
    public ASTNode visitStringFactor(AngularParser.StringFactorContext ctx) {
        return new StringFactor(new StringLiteral(ctx.STRING().getText()));
    }

    @Override
    public ASTNode visitIdentifierFactor(AngularParser.IdentifierFactorContext ctx) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < ctx.children.size(); i++) {
            builder.append(ctx.getChild(i).getText());
        }

        String identifierName = builder.toString();
        VariableSymbolTable.VariableSymbol identifierSymbol = VariableSymbolTable.lookup(identifierName);

        // handling the undefined variables.
        if (identifierSymbol == null) {
            SemanticErrorCollector.add("Line " + ctx.getStart().getLine() + ": Undefined variable '" + identifierName + "'");
        }

        return new IdentifierFactor(new Identifier(builder.toString()));
    }

    @Override
    public ASTNode visitParenthesizedFactor(AngularParser.ParenthesizedFactorContext ctx) {
        return new ParenthesizedFactor(new Parenthesized((Expression) visit(ctx.expression())));
    }

    @Override
    public ASTNode visitAssignment(AngularParser.AssignmentContext ctx) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < ctx.ID().size(); i++) {
            builder.append(ctx.ID(i).getText());
        }

        String identifierName = builder.toString();
        VariableSymbolTable.VariableSymbol identifierSymbol = VariableSymbolTable.lookup(identifierName);
        Expression expression = (Expression) visit(ctx.expression());

        // handling the undefined variables.
        if (identifierSymbol == null) {
            SemanticErrorCollector.add("Line " + ctx.getStart().getLine() + ": Undefined variable '" + identifierName + "'");
            return new AssignmentStatement(expression, new Identifier(identifierName));
        }

        String assignedType = evaluateExpressionType(expression);
        String identifierType = identifierSymbol.getType();
        if (!typesAreCompatible(identifierType, assignedType)) {
            SemanticErrorCollector.add(String.format(
                    "Line %d: Type mismatch: Cannot assign '%s' to variable '%s' of type '%s'",
                    ctx.getStart().getLine(), assignedType, identifierName, identifierType
            ));
        }


        return new AssignmentStatement(expression, new Identifier(identifierName));
    }

    @Override
    public ASTNode visitArrayExpr(AngularParser.ArrayExprContext ctx) {
        return visit(ctx.arrayExpression());
    }

    @Override
    public ASTNode visitArrayLiteral(AngularParser.ArrayLiteralContext ctx) {
        ArrayExpression array = new ArrayExpression();
        for (int i = 0; i < ctx.expression().size(); i++) {
            array.addExpression((Expression) visit(ctx.expression(i)));
        }
        return array;
    }

    @Override
    public ASTNode visitObjectExpr(AngularParser.ObjectExprContext ctx) {
        return visit(ctx.objectExpression());
    }

    @Override
    public ASTNode visitObjectLiteral(AngularParser.ObjectLiteralContext ctx) {
        ObjectExpression expression = new ObjectExpression();
        for (int i = 0; i < ctx.objectProperty().size(); i++) {
            expression.addProperty((ObjectProperty) visit(ctx.objectProperty(i)));
        }
        return expression;
    }

    @Override
    public ASTNode visitProperty(AngularParser.PropertyContext ctx) {
        return new ObjectProperty(new Identifier(ctx.ID().getText()), (Expression) visit(ctx.expression()));
    }

    @Override
    public ASTNode visitComponentDef(AngularParser.ComponentDefContext ctx) {
        return new ComponentDefinition((ComponentDecorator) visit(ctx.componentDecorator()), (ClassDefinition) visit(ctx.classDefinition()));
    }

    @Override
    public ASTNode visitComponentDecoratorExpr(AngularParser.ComponentDecoratorExprContext ctx) {
        return visit(ctx.componentDecoratorBody());
    }

    @Override
    public ASTNode visitDecoratorBody(AngularParser.DecoratorBodyContext ctx) {
        return  new ComponentDecorator((StringLiteral) visit(ctx.selector()), (StringLiteral) visit(ctx.templateUrl()), (StringArray) visit(ctx.styleurls()));
    }

    @Override
    public ASTNode visitSelectorDef(AngularParser.SelectorDefContext ctx) {
        return new StringLiteral(ctx.STRING().getText());
    }

    @Override
    public ASTNode visitTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx) {
        return new StringLiteral(ctx.STRING().getText());
    }

    @Override
    public ASTNode visitStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx) {
        return visit(ctx.stringArray());
    }

    @Override
    public ASTNode visitStringArray(AngularParser.StringArrayContext ctx) {
        StringArray array = new StringArray();
        for (int i = 0 ; i < ctx.STRING().size(); i++) {
            array.addStringLiteral(new StringLiteral(ctx.STRING(i).getText()));
        }
        return array;
    }

    @Override
    public ASTNode visitServiceDef(AngularParser.ServiceDefContext ctx) {
        return new ServiceDefinition((ServiceDecorator) visit(ctx.serviceDecorator()), (ClassDefinition) visit(ctx.classDefinition()));
    }

    @Override
    public ASTNode visitServiceDecoratorExpr(AngularParser.ServiceDecoratorExprContext ctx) {
        return visit(ctx.serviceDecoratorBody());
    }

    @Override
    public ASTNode visitServiceConfig(AngularParser.ServiceConfigContext ctx) {
        return new ServiceDecorator((StringLiteral) new StringLiteral(ctx.STRING().getText()));
    }

    @Override
    public ASTNode visitClassDef(AngularParser.ClassDefContext ctx) {
        SymbolTable.addSymbol(ctx.ID().getText(), "class", currentScope, "class-body");
        currentScope = "class" + ctx.ID().getText();
        return new ClassDefinition(new Identifier(ctx.ID().getText()), (ClassBody) visit(ctx.classBody()));
    }

    @Override
    public ASTNode visitClassBodyBlock(AngularParser.ClassBodyBlockContext ctx) {
        ClassBody body = new ClassBody();
        for (int i = 0; i < ctx.classMember().size(); i++) {
            body.addClassMember((ClassMember) visit(ctx.classMember(i)));
        }
        return body;
    }

    @Override
    public ASTNode visitClassProperty(AngularParser.ClassPropertyContext ctx) {
        return visit(ctx.propertyDeclaration());
    }

    @Override
    public ASTNode visitPropertyDef(AngularParser.PropertyDefContext ctx) {
        Type type;
        Expression expression;
        if (ctx.type() != null) type = (Type) visit(ctx.type());
        else type = null;
        if (ctx.expression() != null) expression = (Expression) visit(ctx.expression());
        else expression = null;

        String staticOrInstance = "instance";
        if (ctx.getChild(0).getText() == "static" ) staticOrInstance = "static";
        SymbolTable.addSymbol(ctx.ID().getText(), type != null ? ctx.type().getText() : "any" , currentScope, expression != null ? ctx.expression().getText() : "undefined");
        return new PropertyDeclaration(staticOrInstance, new Identifier(ctx.ID().getText()), type, expression);
    }

    @Override
    public ASTNode visitConstructorDef(AngularParser.ConstructorDefContext ctx) {
        FunctionBody body = null;
        ParameterList params = null;

        // Safely visit functionBody if it exists
        if (ctx.functionBody() != null) {
            ASTNode bodyNode = visit(ctx.functionBody());
            if (bodyNode instanceof FunctionBody) {
                body = (FunctionBody) bodyNode;
            }
        }

        // Safely visit parameterList if it exists
        if (ctx.parameterList() != null) {
            ASTNode paramsNode = visit(ctx.parameterList());
            if (paramsNode instanceof ParameterList) {
                params = (ParameterList) paramsNode;
            }
        }

        SymbolTable.addSymbol("constructor", "any", currentScope, "constructor-body");
        currentScope = "constructor";
        return new ConstructorDefinition(body, params);
    }

    @Override
    public ASTNode visitMethodDef(AngularParser.MethodDefContext ctx) {
        String staticOrInstance = "instance";
        if (ctx.getChild(0).getText() == "static" ) staticOrInstance = "static";
        SymbolTable.addSymbol(ctx.ID().getText(), ctx.type() != null ? ctx.type().getText() : "any", currentScope, "method-body");
        currentScope = "method" + ctx.ID().getText();
        return new MethodDefinition(staticOrInstance, new Identifier(ctx.ID().getText()), ctx.parameterList() != null ? (ParameterList) visit(ctx.parameterList()) : null, ctx.type() != null ? (Type) visit(ctx.type()) : null, (FunctionBody) visit(ctx.functionBody()));
    }

    @Override
    public ASTNode visitPrimitiveTypeExpr(AngularParser.PrimitiveTypeExprContext ctx) {
        return new PrimitiveType(ctx.primitiveType().getText());
    }
    @Override
    public ASTNode visitPrimitiveArrayType(AngularParser.PrimitiveArrayTypeContext ctx) {
        return new ArrayType(ctx.primitiveType().getChild(0).getText());
    }

    @Override
    public ASTNode visitCustomArrayType(AngularParser.CustomArrayTypeContext ctx) {
        return new ArrayType(ctx.ID().getText());
    }

    @Override
    public ASTNode visitParameters(AngularParser.ParametersContext ctx) {
        ParameterList list =  new ParameterList();
        for(int i = 0 ; i < ctx.parameter().size(); i++) {
            list.addParameter((Parameter) visit(ctx.parameter(i)));
        }
        return list;
    }

    @Override
    public ASTNode visitTypedParameter(AngularParser.TypedParameterContext ctx) {
        VariableSymbolTable.declareVariable(ctx.ID().getText(), ctx.type().getText(), "null", ctx.getStart().getLine());
        SymbolTable.addSymbol(ctx.ID().getText(), ctx.type().getText(), currentScope, "parameter");
        return new Parameter(new Identifier(ctx.ID().getText()), (Type) visit(ctx.type()));
    }

    @Override
    public ASTNode visitUntypedParameter(AngularParser.UntypedParameterContext ctx) {
        VariableSymbolTable.declareVariable(ctx.ID().getText(), "any", "null", ctx.getStart().getLine());
        SymbolTable.addSymbol(ctx.ID().getText(), "any", currentScope, "parameter");
        return new Parameter(new Identifier(ctx.ID().getText()), null);
    }

    @Override
    public ASTNode visitScopeOfStatements(AngularParser.ScopeOfStatementsContext ctx) {
        VariableSymbolTable.enterScope();

        ScopeOfStatements scope =  new ScopeOfStatements();
        for(int i = 0; i < ctx.statement().size(); i++) {
            scope.addStatement((Statement) visit(ctx.statement(i)));
        }

        VariableSymbolTable.exitScope();

        return scope;
    }

    @Override
    public ASTNode visitIdentifierExpr(AngularParser.IdentifierExprContext ctx) {
        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < ctx.children.size(); i++) {
            builder.append(ctx.getChild(i).getText());
        }
        String identifierName = builder.toString();
        VariableSymbolTable.VariableSymbol identifierSymbol = VariableSymbolTable.lookup(identifierName);

        // handling the undefined variables.
        if (identifierSymbol == null) {
            SemanticErrorCollector.add("Line " + ctx.getStart().getLine() + ": Undefined variable '" + identifierName + "'");
        }

        return new Identifier(identifierName);
    }

    @Override
    public ASTNode visitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx) {
        VariableSymbolTable.enterScope();

        Parenthesized parenthesized = new  Parenthesized((Expression) visit(ctx.expression()));

        VariableSymbolTable.exitScope();

        return parenthesized;
    }

    @Override
    public ASTNode visitFunctionCallExpr(AngularParser.FunctionCallExprContext ctx) {
        return visit(ctx.functionInvocation());
    }

    @Override
    public ASTNode visitWhileLoopStmt(AngularParser.WhileLoopStmtContext ctx) {
        return visit(ctx.whileLoop());
    }

    @Override
    public ASTNode visitWhileStmt(AngularParser.WhileStmtContext ctx) {
        return new WhileLoop((Expression) visit(ctx.expression()), (Statement) visit(ctx.statement()));
    }

    @Override
    public ASTNode visitInterfaceDefStmt(AngularParser.InterfaceDefStmtContext ctx) {
        return visit(ctx.interfaceDefinition());
    }

    @Override
    public ASTNode visitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx) {
        return new Interface(new Identifier(ctx.ID().getText()), (InterfaceBody) visit(ctx.interfaceBody()));
    }

    @Override
    public ASTNode visitInterfaceBod(AngularParser.InterfaceBodContext ctx) {
        InterfaceBody body =  new InterfaceBody();
        for (int i = 0 ; i < ctx.type().size(); i++) {
            body.addId(new Identifier(ctx.ID(i).getText()), (Type) visit(ctx.type(i)));
        }
        return body;
    }
}

