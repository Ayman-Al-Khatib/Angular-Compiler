parser grammar AngularParser;

@header {
package antlr;
}

options {
	tokenVocab = AngularLexer;
	visitor = true;
	package = antlr;
}

//! ========================== * Grammar Rules - Program Structure ! ==========================
program: statement*?;

statement:
	importStatement			# ImportStmt
	| typeDefinition		# TypeDefStmt
	| variableDeclaration	# VarDeclStmt
	| functionDefinition	# FuncDefStmt
	| functionInvocation	# FuncInvokeStmt
	| ifStatement			# IfStmt
	| loopStatement			# LoopStmt
	| assignmentStatement	# AssignStmt
	| componentDefinition	# ComponentStmt
	| serviceDefinition		# ServiceStmt
	| scopeOfStatements     # ScopeStmt
	;

//! ========================== * Import Statements ! ==========================
importStatement:
	IMPORT LBRACE ID (COMMA ID)* RBRACE FROM STRING SEMI	# ImportMultiple
	| IMPORT ID FROM STRING SEMI							# ImportSingle;

//! ========================== * Type Definition ! ==========================
typeDefinition:
    typeAliasDefinition    # TypeAliasDefStmt
  | interfaceDefinition    # InterfaceDefStmt
;

typeAliasDefinition:
    TYPE ID ASSIGN LBRACE typeBody RBRACE SEMI
;

interfaceDefinition:
    INTERFACE ID LBRACE interfaceBody RBRACE
;

interfaceBody: (ID COLON type SEMI)* #InterfaceBod;

typeBody: (ID (COLON type)? SEMI)*;

//! ========================== * Variable Declarations ! ==========================
variableDeclaration:
    varDeclWithType   # VarDeclWithTypeStmt
  | varDeclWithInit   # VarDeclWithInitStmt
  ;

varDeclWithType:
    (LET | CONST | VAR) ID COLON type (ASSIGN expression)? SEMI
;

varDeclWithInit:
    (LET | CONST | VAR) ID (ASSIGN expression)? SEMI
;

//! ========================== * Function Definitions ! ==========================
functionDefinition:
    functionDecl               # FunctionDeclStmt
  | emptyFunctionDecl          # EmptyFunctionDeclStmt
  | arrowFunction             # ArrowFunctionStmt
  | emptyArrowFunction        # EmptyArrowFunctionStmt
;

functionDecl:
    FUNCTION ID LPAREN parameterList? RPAREN (COLON type)? LBRACE functionBody RBRACE
;

emptyFunctionDecl:
    FUNCTION ID LPAREN parameterList? RPAREN (COLON type)? LBRACE RBRACE
;

arrowFunction:
    (LET | CONST | VAR) ID (COLON type)? ASSIGN LPAREN parameterList? RPAREN ASSIGN GT LBRACE functionBody RBRACE SEMI
;

emptyArrowFunction:
    (LET | CONST | VAR) ID (COLON type)? ASSIGN LPAREN parameterList? RPAREN ASSIGN GT LBRACE RBRACE SEMI
;

// functino body, scope of statements , parenthesized expr
functionBody: statement* returnStatement?;

returnStatement: RETURN expression SEMI # ReturnStmt;

//! ========================== * Function Invocation ! ==========================
functionInvocation:
	functionName LPAREN argumentList? RPAREN SEMI # FunctionCall;

functionName: (THIS DOT)? ID (DOT ID)* # FunctionNameExpr;

argumentList: expression (COMMA expression)* # Arguments;

//! ========================== * Conditional Structures ! ==========================
ifStatement
    : IF LPAREN expression RPAREN statement elseIfBlock* elseBlock?
    ;

elseIfBlock
    : ELSE IF LPAREN expression RPAREN statement # ElseIfStmt
    ;

elseBlock
    : ELSE statement # ElseStmt
    ;


//! ========================== * Loop Structures ! ==========================
loopStatement:
	forLoop		# ForLoopStmt
	| whileLoop	# WhileLoopStmt;

forLoop:
	FOR LPAREN forInitializer? SEMI? forCondition? SEMI? forUpdate? RPAREN (
		statement
	) # ForStmt;

whileLoop:
	WHILE LPAREN expression RPAREN (
		statement
	) # WhileStmt;

forInitializer:
	variableDeclaration	# ForVarInit
    ;

forCondition: expression # ForCond;

forUpdate: expression # ForUpdateExpr;

//! ========================== * Expressions ! ==========================
expression:
	STRING						# StringLiteral
	| NUMBER					# NumberLiteral
	| BOOLEAN                   # BooleanLiteral
	| postfixExpression         # PostFixExp
	| logicalExpression			# LogicalExpr
	| arrayExpression			# ArrayExpr
	| objectExpression			# ObjectExpr
	| functionInvocation		# FunctionCallExpr
	| (THIS DOT)? ID (DOT ID)*	# IdentifierExpr
	| LPAREN expression RPAREN	# ParenthesizedExpr;

postfixExpression
    : ID ( INCREMENT | DECREMENT )*
    ;

logicalExpression:
	arithmeticExpression (
		(AND | OR | EQ | NEQ | LT | GT | LEQ | GEQ) arithmeticExpression
	)* # LogicalOpExpr;

arithmeticExpression:
	term ( termAction term)* # ArithmeticOpExpr;
termAction: (PLUS | MINUS);

term: factor (factorAction factor)* # TermOpExpr;
factorAction: (STAR | DIV);

factor:
	NUMBER						# NumberFactor
	| STRING					# StringFactor
	| (THIS DOT)? ID (DOT ID)*	# IdentifierFactor
	| LPAREN expression RPAREN	# ParenthesizedFactor;

assignmentStatement: (THIS DOT)? ID (DOT ID)*? ASSIGN expression SEMI # Assignment;

arrayExpression:
	BINDING_START (expression (COMMA expression)*)? COMMA? BINDING_END # ArrayLiteral;

objectExpression:
	LBRACE (objectProperty (COMMA objectProperty)*)? COMMA? RBRACE # ObjectLiteral;

objectProperty: ID COLON expression # Property;

//! ========================== * Component Definition ! ==========================
componentDefinition:
	componentDecorator classDefinition # ComponentDef;

componentDecorator:
	COMPONENT LPAREN LBRACE componentDecoratorBody RBRACE RPAREN # ComponentDecoratorExpr;

componentDecoratorBody:
	selector COMMA templateUrl (COMMA styleurls)?	#DecoratorBody;

selector: SELECTOR COLON STRING # SelectorDef;
templateUrl: TEMPLATEURL COLON STRING # TemplateUrlDef;
styleurls: STYLEURLS COLON stringArray # StyleUrlsDef;

//! ========================== * Service Definition ! ==========================
serviceDefinition:
	serviceDecorator classDefinition # ServiceDef;

serviceDecorator:
	SERVICE_DECORATOR LPAREN serviceDecoratorBody RPAREN # ServiceDecoratorExpr;

serviceDecoratorBody:
	LBRACE PROVIDEDIN COLON STRING COMMA? RBRACE # ServiceConfig;

//! ========================== * Class Definitions ! ==========================
classDefinition: (EXPORT DEFAULT?)? CLASS ID classBody # ClassDef;

classBody: LBRACE classMember* RBRACE # ClassBodyBlock;

classMember:
	propertyDeclaration			# ClassProperty
	| methodDefinition			# ClassMethod
	| constructorDeclaration	# ClassConstructor;

constructorDeclaration:
	CONSTRUCTOR LPAREN parameterList? RPAREN LBRACE functionBody RBRACE # ConstructorDef;

propertyDeclaration: (STATIC | READONLY)? (
		PRIVATE
		| PUBLIC
		| PROTECTED
	)? ID (COLON type)? (ASSIGN expression)? SEMI # PropertyDef;

methodDefinition:
	(STATIC | READONLY)?
	(PRIVATE | PUBLIC | PROTECTED)?
    ID
    LPAREN ( parameterList? ) RPAREN
    (COLON type)?
    LBRACE functionBody RBRACE # MethodDef;


//! ========================== * Types And Parameters ! ==========================
type:
	primitiveType			# PrimitiveTypeExpr
	| arrayType				# ArrayTypeExpr
	| ID					# CustomTypeExpr
    ;

primitiveType:
	TYPE_STRING		# StringType
	| TYPE_NUMBER	# NumberType
	| TYPE_BOOLEAN	# BooleanType
	| TYPE_ANY		# AnyType;

arrayType:
	primitiveType BINDING_START BINDING_END	# PrimitiveArrayType
	| ID BINDING_START BINDING_END			# CustomArrayType;

parameterList: parameter (COMMA parameter)* # Parameters;

parameter:
	ID COLON type	# TypedParameter
	| ID			# UntypedParameter;

//! ========================== * Helpers ! ==========================
scopeOfStatements: LBRACE statement* RBRACE;

stringArray:
	BINDING_START STRING (COMMA STRING)? COMMA? BINDING_END;