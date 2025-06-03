lexer grammar AngularLexer;

@header {
package antlr;
}

////! ==========================
////* Reserved Keywords
////! ==========================
STYLE       : 'style';
CLASS       : 'class';
IMPORT      : 'import';
FROM        : 'from';
EXPORT      : 'export';
LET         : 'let';
CONST       : 'const';
VAR         : 'var';
FUNCTION    : 'function';
RETURN      : 'return';
IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
OF          : 'of';
TYPE        : 'type';
INTERFACE   : 'interface';
CONSTRUCTOR : 'constructor';
PRIVATE     : 'private';
PUBLIC      : 'public';
PROTECTED   : 'protected';
THIS        : 'this';
PRINT       : 'print';
ABSTRACT    : 'abstract';
ASYNC       : 'async';
DEFAULT     : 'default';
EXTENDS     : 'extends';
IMPLEMENTS  : 'implements';
STATIC      : 'static';
READONLY    : 'readonly';
OVERRIDE    : 'override';
BOOLEAN     : 'true' | 'false';
INCREMENT   : '++';
DECREMENT   : '--';
//! ==========================
//* Special Symbols
//! ==========================
LBRACE        : '{';
RBRACE        : '}';
LPAREN        : '(';
RPAREN        : ')';
COLON         : ':';
COMMA         : ',';
DOT           : '.';
BACKTICK      : '`';
SEMI          : ';';
ASSIGN        : '=';
LT            : '<';
GT            : '>';
LEQ           : '<=';
GEQ           : '>=';
EQ            : '==';
NEQ           : '!=';
PLUS          : '+';
MINUS         : '-';
STAR          : '*';
DIV           : '/';
AND           : '&&';
OR            : '||';
BINDING_START : '[';
BINDING_END   : ']';
DOLLAR        : '$';
AT            : '@';
PIPE          : '|';
AMBER         : '&';
QUOTE         : '"';

// Structural and style tokens
TWO_WAY_BIND: '[(';
TWO_WAY_END: ')]';
INTERPOLATION: '{{' .*? '}}'; // Interpolation syntax

//! ==========================
//* Lexical Rules (Basic Tokens and Fragments)
//! ==========================
fragment LETTER : [A-Za-z_];
fragment DIGIT  : [0-9];

COMPONENT            : '@Component';
SERVICE_DECORATOR    : '@Injectable';
TEMPLATEURL          : 'templateUrl';
STYLEURLS            : 'styleUrls';
SELECTOR             : 'selector';
PROVIDEDIN           : 'providedIn';

TYPE_STRING      : 'string';
TYPE_NUMBER      : 'number';
TYPE_BOOLEAN     : 'boolean';
TYPE_ANY         : 'any';

ID          : LETTER (LETTER | DIGIT)*;
NUMBER      : DIGIT+ (DOT DIGIT+)? ('E' [+-]? DIGIT+)?;
STRING      : '"' ~["'`]*? '"' | '\'' ~["'`]*? '\'' | '`' ~["'`]*? '`';

//! Whitespace and comments
WS            : [ \t\r\n]+ -> skip;
COMMENT       : '//' ~[\r\n]* -> skip;
MULTI_COMMENT : '/*' .*? '*/' -> skip;

