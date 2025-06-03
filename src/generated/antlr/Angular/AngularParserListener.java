// Generated from C:/Users/Ahmed_Ajajeh/Desktop/university/fourth-year/compiler-project/edited-compiler/src/grammar/AngularParser.g4 by ANTLR 4.13.2

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(AngularParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(AngularParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeDefStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefStmt(AngularParser.TypeDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeDefStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefStmt(AngularParser.TypeDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(AngularParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(AngularParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDefStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefStmt(AngularParser.FuncDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDefStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefStmt(AngularParser.FuncDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncInvokeStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvokeStmt(AngularParser.FuncInvokeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncInvokeStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvokeStmt(AngularParser.FuncInvokeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(AngularParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(AngularParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(AngularParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(AngularParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(AngularParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(AngularParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentStmt(AngularParser.ComponentStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentStmt(AngularParser.ComponentStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterServiceStmt(AngularParser.ServiceStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitServiceStmt(AngularParser.ServiceStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScopeStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterScopeStmt(AngularParser.ScopeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScopeStmt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitScopeStmt(AngularParser.ScopeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportMultiple}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportMultiple(AngularParser.ImportMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportMultiple}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportMultiple(AngularParser.ImportMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportSingle(AngularParser.ImportSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportSingle}
	 * labeled alternative in {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportSingle(AngularParser.ImportSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAliasDefStmt}
	 * labeled alternative in {@link AngularParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasDefStmt(AngularParser.TypeAliasDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAliasDefStmt}
	 * labeled alternative in {@link AngularParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasDefStmt(AngularParser.TypeAliasDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDefStmt}
	 * labeled alternative in {@link AngularParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefStmt(AngularParser.InterfaceDefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDefStmt}
	 * labeled alternative in {@link AngularParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefStmt(AngularParser.InterfaceDefStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasDefinition(AngularParser.TypeAliasDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeAliasDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasDefinition(AngularParser.TypeAliasDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDefinition(AngularParser.InterfaceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceBod}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBod(AngularParser.InterfaceBodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceBod}
	 * labeled alternative in {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBod(AngularParser.InterfaceBodContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void enterTypeBody(AngularParser.TypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#typeBody}.
	 * @param ctx the parse tree
	 */
	void exitTypeBody(AngularParser.TypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclWithTypeStmt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclWithTypeStmt(AngularParser.VarDeclWithTypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclWithTypeStmt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclWithTypeStmt(AngularParser.VarDeclWithTypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclWithInitStmt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclWithInitStmt(AngularParser.VarDeclWithInitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclWithInitStmt}
	 * labeled alternative in {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclWithInitStmt(AngularParser.VarDeclWithInitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varDeclWithType}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclWithType(AngularParser.VarDeclWithTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varDeclWithType}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclWithType(AngularParser.VarDeclWithTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varDeclWithInit}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclWithInit(AngularParser.VarDeclWithInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varDeclWithInit}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclWithInit(AngularParser.VarDeclWithInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclStmt(AngularParser.FunctionDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclStmt(AngularParser.FunctionDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyFunctionDeclStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEmptyFunctionDeclStmt(AngularParser.EmptyFunctionDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyFunctionDeclStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEmptyFunctionDeclStmt(AngularParser.EmptyFunctionDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionStmt(AngularParser.ArrowFunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionStmt(AngularParser.ArrowFunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyArrowFunctionStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrowFunctionStmt(AngularParser.EmptyArrowFunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyArrowFunctionStmt}
	 * labeled alternative in {@link AngularParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrowFunctionStmt(AngularParser.EmptyArrowFunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#emptyFunctionDecl}.
	 * @param ctx the parse tree
	 */
	void enterEmptyFunctionDecl(AngularParser.EmptyFunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#emptyFunctionDecl}.
	 * @param ctx the parse tree
	 */
	void exitEmptyFunctionDecl(AngularParser.EmptyFunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#emptyArrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArrowFunction(AngularParser.EmptyArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#emptyArrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArrowFunction(AngularParser.EmptyArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(AngularParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(AngularParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AngularParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link AngularParser#functionInvocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionNameExpr}
	 * labeled alternative in {@link AngularParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameExpr(AngularParser.FunctionNameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionNameExpr}
	 * labeled alternative in {@link AngularParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameExpr(AngularParser.FunctionNameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arguments}
	 * labeled alternative in {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arguments}
	 * labeled alternative in {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AngularParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseIfStmt}
	 * labeled alternative in {@link AngularParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStmt(AngularParser.ElseIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseIfStmt}
	 * labeled alternative in {@link AngularParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStmt(AngularParser.ElseIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link AngularParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(AngularParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link AngularParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(AngularParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoopStmt}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterForLoopStmt(AngularParser.ForLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoopStmt}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitForLoopStmt(AngularParser.ForLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoopStmt}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopStmt(AngularParser.WhileLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoopStmt}
	 * labeled alternative in {@link AngularParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopStmt(AngularParser.WhileLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link AngularParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(AngularParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link AngularParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(AngularParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link AngularParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(AngularParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarInit}
	 * labeled alternative in {@link AngularParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void enterForVarInit(AngularParser.ForVarInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarInit}
	 * labeled alternative in {@link AngularParser#forInitializer}.
	 * @param ctx the parse tree
	 */
	void exitForVarInit(AngularParser.ForVarInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCond}
	 * labeled alternative in {@link AngularParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCond(AngularParser.ForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCond}
	 * labeled alternative in {@link AngularParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCond(AngularParser.ForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForUpdateExpr}
	 * labeled alternative in {@link AngularParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdateExpr(AngularParser.ForUpdateExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForUpdateExpr}
	 * labeled alternative in {@link AngularParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdateExpr(AngularParser.ForUpdateExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(AngularParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(AngularParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(AngularParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostFixExp}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostFixExp(AngularParser.PostFixExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostFixExp}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostFixExp(AngularParser.PostFixExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(AngularParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(AngularParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(AngularParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterObjectExpr(AngularParser.ObjectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitObjectExpr(AngularParser.ObjectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpr(AngularParser.FunctionCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpr(AngularParser.FunctionCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(AngularParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpr}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpr(AngularParser.ParenthesizedExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(AngularParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(AngularParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOpExpr}
	 * labeled alternative in {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOpExpr(AngularParser.LogicalOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOpExpr}
	 * labeled alternative in {@link AngularParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOpExpr(AngularParser.LogicalOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArithmeticOpExpr}
	 * labeled alternative in {@link AngularParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOpExpr(AngularParser.ArithmeticOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArithmeticOpExpr}
	 * labeled alternative in {@link AngularParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOpExpr(AngularParser.ArithmeticOpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#termAction}.
	 * @param ctx the parse tree
	 */
	void enterTermAction(AngularParser.TermActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#termAction}.
	 * @param ctx the parse tree
	 */
	void exitTermAction(AngularParser.TermActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermOpExpr}
	 * labeled alternative in {@link AngularParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermOpExpr(AngularParser.TermOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermOpExpr}
	 * labeled alternative in {@link AngularParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermOpExpr(AngularParser.TermOpExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#factorAction}.
	 * @param ctx the parse tree
	 */
	void enterFactorAction(AngularParser.FactorActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#factorAction}.
	 * @param ctx the parse tree
	 */
	void exitFactorAction(AngularParser.FactorActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(AngularParser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(AngularParser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterStringFactor(AngularParser.StringFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitStringFactor(AngularParser.StringFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFactor(AngularParser.IdentifierFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFactor(AngularParser.IdentifierFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedFactor(AngularParser.ParenthesizedFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedFactor}
	 * labeled alternative in {@link AngularParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedFactor(AngularParser.ParenthesizedFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link AngularParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteral}
	 * labeled alternative in {@link AngularParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(AngularParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link AngularParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteral}
	 * labeled alternative in {@link AngularParser#objectExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(AngularParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Property}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void enterProperty(AngularParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Property}
	 * labeled alternative in {@link AngularParser#objectProperty}.
	 * @param ctx the parse tree
	 */
	void exitProperty(AngularParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDef}
	 * labeled alternative in {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void enterComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDef}
	 * labeled alternative in {@link AngularParser#componentDefinition}.
	 * @param ctx the parse tree
	 */
	void exitComponentDef(AngularParser.ComponentDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDecoratorExpr}
	 * labeled alternative in {@link AngularParser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecoratorExpr(AngularParser.ComponentDecoratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDecoratorExpr}
	 * labeled alternative in {@link AngularParser#componentDecorator}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecoratorExpr(AngularParser.ComponentDecoratorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorBody}
	 * labeled alternative in {@link AngularParser#componentDecoratorBody}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorBody(AngularParser.DecoratorBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorBody}
	 * labeled alternative in {@link AngularParser#componentDecoratorBody}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorBody(AngularParser.DecoratorBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorDef}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDef(AngularParser.SelectorDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorDef}
	 * labeled alternative in {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDef(AngularParser.SelectorDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlDef}
	 * labeled alternative in {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlDef}
	 * labeled alternative in {@link AngularParser#templateUrl}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlDef(AngularParser.TemplateUrlDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlsDef}
	 * labeled alternative in {@link AngularParser#styleurls}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlsDef}
	 * labeled alternative in {@link AngularParser#styleurls}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsDef(AngularParser.StyleUrlsDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceDef}
	 * labeled alternative in {@link AngularParser#serviceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterServiceDef(AngularParser.ServiceDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceDef}
	 * labeled alternative in {@link AngularParser#serviceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitServiceDef(AngularParser.ServiceDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceDecoratorExpr}
	 * labeled alternative in {@link AngularParser#serviceDecorator}.
	 * @param ctx the parse tree
	 */
	void enterServiceDecoratorExpr(AngularParser.ServiceDecoratorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceDecoratorExpr}
	 * labeled alternative in {@link AngularParser#serviceDecorator}.
	 * @param ctx the parse tree
	 */
	void exitServiceDecoratorExpr(AngularParser.ServiceDecoratorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ServiceConfig}
	 * labeled alternative in {@link AngularParser#serviceDecoratorBody}.
	 * @param ctx the parse tree
	 */
	void enterServiceConfig(AngularParser.ServiceConfigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ServiceConfig}
	 * labeled alternative in {@link AngularParser#serviceDecoratorBody}.
	 * @param ctx the parse tree
	 */
	void exitServiceConfig(AngularParser.ServiceConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link AngularParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(AngularParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDef}
	 * labeled alternative in {@link AngularParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(AngularParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassBodyBlock}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyBlock(AngularParser.ClassBodyBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassBodyBlock}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyBlock(AngularParser.ClassBodyBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassProperty}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassProperty(AngularParser.ClassPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassProperty}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassProperty(AngularParser.ClassPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassMethod}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMethod(AngularParser.ClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassMethod}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMethod(AngularParser.ClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassConstructor}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassConstructor(AngularParser.ClassConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassConstructor}
	 * labeled alternative in {@link AngularParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassConstructor(AngularParser.ClassConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstructorDef}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDef(AngularParser.ConstructorDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstructorDef}
	 * labeled alternative in {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDef(AngularParser.ConstructorDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyDef}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDef(AngularParser.PropertyDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyDef}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDef(AngularParser.PropertyDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodDef}
	 * labeled alternative in {@link AngularParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(AngularParser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodDef}
	 * labeled alternative in {@link AngularParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(AngularParser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimitiveTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveTypeExpr(AngularParser.PrimitiveTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimitiveTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveTypeExpr(AngularParser.PrimitiveTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeExpr(AngularParser.ArrayTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeExpr(AngularParser.ArrayTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCustomTypeExpr(AngularParser.CustomTypeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomTypeExpr}
	 * labeled alternative in {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCustomTypeExpr(AngularParser.CustomTypeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(AngularParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(AngularParser.NumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(AngularParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyType}
	 * labeled alternative in {@link AngularParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitAnyType(AngularParser.AnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimitiveArrayType}
	 * labeled alternative in {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveArrayType(AngularParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimitiveArrayType}
	 * labeled alternative in {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveArrayType(AngularParser.PrimitiveArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomArrayType}
	 * labeled alternative in {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterCustomArrayType(AngularParser.CustomArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomArrayType}
	 * labeled alternative in {@link AngularParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitCustomArrayType(AngularParser.CustomArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parameters}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AngularParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parameters}
	 * labeled alternative in {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AngularParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterTypedParameter(AngularParser.TypedParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitTypedParameter(AngularParser.TypedParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UntypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterUntypedParameter(AngularParser.UntypedParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UntypedParameter}
	 * labeled alternative in {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitUntypedParameter(AngularParser.UntypedParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#scopeOfStatements}.
	 * @param ctx the parse tree
	 */
	void enterScopeOfStatements(AngularParser.ScopeOfStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#scopeOfStatements}.
	 * @param ctx the parse tree
	 */
	void exitScopeOfStatements(AngularParser.ScopeOfStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stringArray}.
	 * @param ctx the parse tree
	 */
	void enterStringArray(AngularParser.StringArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stringArray}.
	 * @param ctx the parse tree
	 */
	void exitStringArray(AngularParser.StringArrayContext ctx);
}