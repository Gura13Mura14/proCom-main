lexer grammar AngularLexer;

tokens { TAG_OPEN, TEXT }

@header {
  // Support combined Angular TypeScript, HTML, and CSS
}

// Default mode — detects HTML and script/style tags
SCRIPT_OPEN: '<script>' -> pushMode(TYPESCRIPT);
STYLE_OPEN: '<style>' -> pushMode(CSS);
TAG_OPEN: '<' -> pushMode(HTML), type(TAG_OPEN);
WS: [ \t\r\n]+ -> skip;
TEXT: ~[<]+ -> type(TEXT);

// -------------------- HTML Mode --------------------
mode HTML;

HTML_TAG_CLOSE: '>' -> popMode;
HTML_SLASH_CLOSE: '/>' -> popMode;
HTML_SLASH: '/';
HTML_EQUALS: '=';
HTML_ATTRIBUTE_VALUE
    : '"' ~["]* '"'
        | '\'' ~[']* '\''
    ;
HTML_PROPERTY_BINDING: '[' ~[\]\r\n]* ']';
HTML_EVENT_BINDING: '(' ( ~[)\r\n] | '\\' )* ')';
HTML_TAG_NAME
  : 'div'| 'span'| 'h1'| 'h2'| 'h3'| 'p'| 'a'| 'ul'| 'li'| 'img'| 'input'| 'button'|'app-product-detail'|'head'|'title' |'link' |'app-root'
  | 'form'| 'table'| 'tr'| 'td'| 'th'| 'label'| 'script'| 'style'|'app-product-list'|'!doctype'|'html '|'meta' |'base' |'body'
  ;
HTML_TWO_WAY_BINDING: '[(' ( ~[)\r\n] | '\\' )* ')]';
HTML_STAR_BINDING: '*' ~[ \t\r\n>]*;
HTML_INTERPOLATION: '{{' .*? '}}';
HTML_ATTRIBUTE_NAME: [a-zA-Z_:][a-zA-Z0-9_.:-]*;

HTML_WS: [ \t\r\n]+ -> skip;

// -------------------- CSS Mode --------------------
mode CSS;

STYLE_CLOSE: '</style>' -> popMode;
CSS_PROPERTY: 'width' | 'height' | 'margin-right' |'cursor' | 'display' |'align-items'
              |'margin' |'margin-bottom' |'list-style' |'padding' |'justify-content' |'flex';
CSS_VALUE
    : [0-9]+
    | [0-9]+ [a-zA-Z%]+         // مثال: 10px, 100%, 5em
    | 'flex'
    | 'space-between'
    | 'block' | 'none' | 'red' | 'pointer' | 'center'
    | '#' HEX3 | '#' HEX6
    ;

fragment HEX3 : [a-fA-F0-9][a-fA-F0-9][a-fA-F0-9];
fragment HEX6 : [a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9][a-fA-F0-9];

CSS_CLASS_SELECTOR: '.' [a-zA-Z_][a-zA-Z0-9_-]*;
CSS_ID_SELECTOR: '#' [a-zA-Z_][a-zA-Z0-9_-]*;
CSS_ELEMENT_SELECTOR: [a-zA-Z_][a-zA-Z0-9_-]*;
CSS_COMBINATOR_WS: [ \t\r\n]+ -> skip;
CSS_LBRACE: '{';
CSS_RBRACE: '}';
CSS_COLON: ':';
CSS_SEMICOLON: ';';
CSS_WS: [ \t\r\n]+ -> skip;

// -------------------- TypeScript Mode --------------------
mode TYPESCRIPT;

SCRIPT_CLOSE: '</script>' -> popMode;

// Keywords
IF: 'if';
ELSEIF: 'else if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
CONTINUE: 'continue';
DEFAULT: 'default';
DO: 'do';
TRY: 'try';
CATCH: 'catch';
FINALLY: 'finally';
THROW: 'throw';
FUNCTION: 'function';
RETURN: 'return';
CONST: 'const';
LET: 'let';
CONSTRUCTOR: 'constructor';
VAR: 'var';
CLASS: 'class';
IMPORT: 'import';
IMPORTS: 'imports';

EXPORT: 'export';
AS: 'as';
FROM: 'from';
NEW: 'new';
THIS: 'this';
IMPLEMENTS: 'implements';

// Angular Decorators
INPUT: '@Input';
OUTPUT: '@Output';
//VIEWCHILD: '@ViewChild';
COMPONENT: '@Component';
NGONINIT: 'ngOnInit';
NGONCHANGES: 'ngOnChanges';
SELECTOR: 'selector';
STANDALONE: 'standalone';
STYLEURL: 'styleUrls';
TEMPLATEURL: 'templateUrl';
TEMPLATE: 'template';
DESCRIBE: 'describe';
INTERFACE : 'interface';
IT: 'it';
BEFOREEACH: 'beforeEach';
AFTEREACH: 'afterEach';
AWAIT: 'await';

// Modifiers
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
READONLY: 'readonly';
STATIC: 'static';
ABSTRACT: 'abstract';
FINAL: 'final';
ASYNC: 'async';

// Operators
EQUAL: '=';
ARROW: '=>';
PLUS: '+';
MINUS: '-';
STAR: '*';
DIVIDE: '/';
MODULO: '%';
AND: '&&';
OR: '||';
NOT: '!';
EQUAL_TO: '==';
EQUAL_TO3: '===';
NOT_EQUAL: '!=';
NOT_EQUAL2: '!==';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';

// Punctuation
LPAREN: '(';
RPAREN: ')';
LSBRACKET: '[';
RSBRACKET: ']';
LCURLY: '{';
RCURLY: '}';
COMMA: ',';
SEMI: ';';
COLON: ':';
DOT: '.';
QUESTION: '?';
A: '@';

// Literals
Integer: [0]|([1-9][0-9]*);
Float: [0-9]+ '.' [0-9]+;
String: ('"' (~["\\])* '"') | ('\'' (~['\\])* '\'');
Boolean: 'true' | 'false';
Undefined: 'undefined';
Null: 'null';
ACCESS_MODIFIER
    : PUBLIC | PRIVATE | PROTECTED
    ;




// Comments
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;
TS_WS: [ \t\r\n]+ -> skip;
IDENTIFIER: [a-zA-Z_$][a-zA-Z0-9_$]*;