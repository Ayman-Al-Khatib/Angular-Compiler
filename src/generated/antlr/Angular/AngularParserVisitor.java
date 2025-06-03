// Generated from C:/Users/Ahmed_Ajajeh/Desktop/university/fourth-year/compiler-project/edited-compiler/src/grammar/AngularParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(AngularParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeDefStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefStmt(AngularParser.TypeDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(AngularParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDefStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefStmt(AngularParser.FuncDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncInvokeStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvokeStmt(AngularParser.FuncInvokeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(AngularParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LoopStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStmt(AngularParser.LoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(AngularParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStmt(AngularParser.ComponentStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceStmt(AngularParser.ServiceStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScopeStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeStmt(AngularParser.ScopeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportMultiple}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportMultiple(AngularParser.ImportMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSingle(AngularParser.ImportSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAliasDefStmt}
	 * labeled alternative in {@link AngularParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasDefStmt(AngularParser.TypeAliasDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDefStmt}
	 * labeled alternative in {@link AngularParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefStmt(AngularParser.InterfaceDefStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeAliasDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasDefinition(AngularParser.TypeAliasDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceBod}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBod(AngularParser.InterfaceBodContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#typeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBody(AngularParser.TypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclWithTypeStmt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclWithTypeStmt(AngularParser.VarDeclWithTypeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclWithInitStmt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclWithInitStmt(AngularParser.VarDeclWithInitStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varDeclWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclWithType(AngularParser.VarDeclWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varDeclWithInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclWithInit(AngularParser.VarDeclWithInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclStmt(AngularParser.FunctionDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyFunctionDeclStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyFunctionDeclStmt(AngularParser.EmptyFunctionDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionStmt(AngularParser.ArrowFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyArrowFunctionStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrowFunctionStmt(AngularParser.EmptyArrowFunctionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#emptyFunctionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyFunctionDecl(AngularParser.EmptyFunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#emptyArrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArrowFunction(AngularParser.EmptyArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AngularParser#functionInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionNameExpr}
	 * labeled alternative in {@link AngularParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNameExpr(AngularParser.FunctionNameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arguments}
	 * labeled alternative in {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseIfStmt}
	 * labeled alternative in {@link AngularParser#elseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStmt(AngularParser.ElseIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link AngularParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(AngularParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoopStmt}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStmt(AngularParser.ForLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoopStmt}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopStmt(AngularParser.WhileLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link AngularParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(AngularParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForVarInit}
	 * labeled alternative in {@link AngularParser#forInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForVarInit(AngularParser.ForVarInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCond}
	 * labeled alternative in {@link AngularParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCond(AngularParser.ForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForUpdateExpr}
	 * labeled alternative in {@link AngularParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdateExpr(AngularParser.ForUpdateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(AngularParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostFixExp}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFixExp(AngularParser.PostFixExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(AngularParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectExpr(AngularParser.ObjectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(AngularParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(AngularParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOpExpr}
	 * labeled alternative in {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOpExpr(AngularParser.LogicalOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArithmeticOpExpr}
	 * labeled alternative in {@link AngularParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOpExpr(AngularParser.ArithmeticOpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#termAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAction(AngularParser.TermActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermOpExpr}
	 * labeled alternative in {@link AngularParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermOpExpr(AngularParser.TermOpExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#factorAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorAction(AngularParser.FactorActionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(AngularParser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringFactor(AngularParser.StringFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierFactor(AngularParser.IdentifierFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedFactor(AngularParser.ParenthesizedFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link AngularParser#arrayExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link AngularParser#objectExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Property}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDef}
	 * labeled alternative in {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDecoratorExpr}
	 * labeled alternative in {@link AngularParser#componentDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecoratorExpr(AngularParser.ComponentDecoratorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorBody}
	 * labeled alternative in {@link AngularParser#componentDecoratorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorBody(AngularParser.DecoratorBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorDef}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDef(AngularParser.SelectorDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlDef}
	 * labeled alternative in {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlsDef}
	 * labeled alternative in {@link AngularParser#styleurls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceDef}
	 * labeled alternative in {@link AngularParser#serviceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDef(AngularParser.ServiceDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceDecoratorExpr}
	 * labeled alternative in {@link AngularParser#serviceDecorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceDecoratorExpr(AngularParser.ServiceDecoratorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ServiceConfig}
	 * labeled alternative in {@link AngularParser#serviceDecoratorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServiceConfig(AngularParser.ServiceConfigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link AngularParser#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(AngularParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassBodyBlock}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyBlock(AngularParser.ClassBodyBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassProperty}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassProperty(AngularParser.ClassPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassMethod}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMethod(AngularParser.ClassMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassConstructor}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassConstructor(AngularParser.ClassConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstructorDef}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDef(AngularParser.ConstructorDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyDef}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDef(AngularParser.PropertyDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodDef}
	 * labeled alternative in {@link AngularParser#methodDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDef(AngularParser.MethodDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimitiveTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveTypeExpr(AngularParser.PrimitiveTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeExpr(AngularParser.ArrayTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomTypeExpr(AngularParser.CustomTypeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimitiveArrayType}
	 * labeled alternative in {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveArrayType(AngularParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CustomArrayType}
	 * labeled alternative in {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomArrayType(AngularParser.CustomArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parameters}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedParameter(AngularParser.TypedParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UntypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntypedParameter(AngularParser.UntypedParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#scopeOfStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScopeOfStatements(AngularParser.ScopeOfStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArray(AngularParser.StringArrayContext ctx);
}