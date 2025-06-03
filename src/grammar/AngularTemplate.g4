grammar AngularTemplate;

@header {
package antlr;
}

//! ==========================
//* Lexer Rules
//! ==========================

LT: '<';
GT: '>';
SLASH: '/';
LPAREN: '(';
RPAREN: ')';
DOT: '.';
COMMA: ',';
ASSIGN: '=';
BINDING_START: '[';
BINDING_END: ']';

fragment DIGIT  : [0-9];
SPECIAL_TAG_NAME: [a-zA-Z_][a-zA-Z0-9_]*('-'[a-zA-Z0-9_]+)+;
ID: [a-zA-Z_][a-zA-Z0-9_]*;         // Matches valid identifiers for attributes and bindings
PROPERTY: ID (DOT ID)*;
INTERPOLATION_STRING: '"' INTERPOLATION '"';
IDENTIFIER_STRING: '"' ID (DOT ID)* '"';
FUNCTION_CALL_STRING: '"' ID '(' PROPERTY? (COMMA PROPERTY)*? ')' '"';
NUMBER      : DIGIT+ (DOT DIGIT+)? ('E' [+-]? DIGIT+)?;
STRING: '"' (~["\r\n])* '"';          // Matches strings enclosed in double quotes

INTERPOLATION: '{{' .*? '}}';          // Matches Angular interpolation syntax {{ expression }}
NG_FOR: '*ngFor';                      // Matches Angular directive ngFor
NG_IF: '*ngIf';                        // Matches Angular directive ngIf

//TEXT: ~[<>]+?;
WS: [ \t\r\n]+ -> skip;                // Whitespace
COMMENT: '<!--' .*? '-->' -> skip;     // HTML comments
TOKEN: ~[<>]+?;

//! ==========================
//* HTML
//! ==========================

htmlTemplate: (htmlElement)*;

// HTML Elements
htmlElement:
	LT (SPECIAL_TAG_NAME | ID) attributeList? SLASH GT
	| LT (SPECIAL_TAG_NAME | ID) attributeList? GT content? closingTag; // Standard opening and closing tag

closingTag: LT SLASH (SPECIAL_TAG_NAME | ID) GT;

// Content within HTML tags
content: (htmlElement | interpolation | text)*;

text: ~(LT | GT)+?;

attributeList: (
		 attribute
		| propertyBinding
		| eventBinding
		| directive
	)*;

// directives
directive
	: ngFor
	| ngIf
	;

ngFor: NG_FOR ASSIGN STRING;
ngIf :  NG_IF ASSIGN IDENTIFIER_STRING;

attribute: ID ASSIGN (STRING | IDENTIFIER_STRING | INTERPOLATION_STRING); // normal html attribute ( id="myDiv" )

// Property Binding
propertyBinding:
BINDING_START (PROPERTY | ID) BINDING_END ASSIGN IDENTIFIER_STRING;
// bind a property of the tag to a variable [class.active]="isActive"

// Event Binding
eventBinding: LPAREN ID RPAREN ASSIGN FUNCTION_CALL_STRING;
// bind an event of the tag to a function (click)="onClick()" Two-way Binding

// Interpolation
interpolation: INTERPOLATION;