
/*
 * Grammar file for the Calculator application.
 */
grammar WPL; 

// Parser rules
compilation_unit : (exprs+=expression ';' | intDef ';' | varDef ';' | strDef ';' | boolDef ';' | inferDef ';' | array ';'
                    | function | externFunction | procedure | externProcedure | block)+ EOF ;

boolean             : TRUE | FALSE ;
assignExpression    : <assoc=right>STRING ':=' expression ;

type                : 'boolean'
                    | 'str'
                    | 'int';

typeGen             : str
                    | int
                    | boolean ;

var                 : str
                    | str ', ' var ;

varDef              : str '<-' expression
                    | str '<-' expression ', ' varDef;

intDec              : str '<-' int
                    | var
                    | intDec ', ' intDec ;

intDef              : 'int ' intDec ;

strDec              : str '<-' str
                    | var
                    | strDec ', ' strDec ;

strDef              : 'str ' strDec ;

boolDec             : str '<-' boolean
                    | var
                    | boolDec ', ' boolDec ;

boolDef             : 'bool ' boolDec ;

inferDec            : str '<-' typeGen
                    | inferDec ', ' inferDec ;

inferDef            : 'var ' inferDec ;

array               : type '[' int ']' str;

//intarray            : 'int' '[' int ']' str ;
//
//strarray            : 'str' '[' int ']' str ;
//
//boolarray           : 'boolean ' '[' int ']' str ;

expression          :
                   '(' expression ')'
                    | <assoc=right> '-' expression
                    | <assoc=right> '~' expression
                    | expression ('*' | '/') expression
                    | expression ('+' | '-') expression
                    | expression ('<' | '>') expression
                    | <assoc=right> expression ('=' | '~=') expression
                    | assignExpression
                    | boolean
                    | str
                    | int
                    | function
                    | externFunction;

parameterList       : type str
                    | type str ', ' parameterList ;

function            : type ' func ' str ' (' parameterList '?)' '{' 'return' type '}' ;

externFunction      : 'extern ' function ;

procedure           : 'proc' str ' (' parameterList '?)' '{' '}' ;

externProcedure     : 'extern ' procedure ;

assignment          : var '<-' expression ;

loop                : 'while ' expression ' do' '{' '}' ;

conditional         : 'if ' expression '{' '}' 'else' '{' '}'
                    | 'if ' expression ' then' '{' '}' 'else' '{' '}'
                    | 'if ' expression '{' conditional '}' 'else' '{' '}'
                    | 'if ' expression '{' '}' 'else' '{' conditional '}'
                    | 'if ' expression '{' conditional '}' 'else' '{' conditional '}'
                    | 'if ' expression ' then' '{' conditional '}' 'else' '{' '}'
                    | 'if ' expression ' then' '{' '}' 'else' '{' conditional '}'
                    | 'if ' expression ' then' '{' conditional '}' 'else' '{' conditional '}' ;

code                : varDef ';'
                    | intDef ';'
                    | strDef ';'
                    | boolDef ';'
                    | loop ';'
                    | assignment ';'
                    | conditional ';'
                    | selection ';'
                    | call ';'
                    | return ';'
                    | code code;


statement           : expression ' : ' expression ';'
                    | statement statement ;

selection           : 'select' '{' statement '}' ;

call                : str '(' var ')' ;

return              : 'return'
                    | 'return ' expression;

block               : '{' '}'
                    | '{' code block '}'
                    | '{' block code '}'
                    | '{' code '}' ;

int                 : INTEGER;

str                 : STRING;



// Lexer rules
// Operators
ASSIGN    : ':=' ;
DIVIDE    : '/' ;
EQUAL     : '=' ;
GREATER   : '>' ;
LESS      : '<' ;
MINUS     : '-' ;
MULTIPLY  : '*' ;
NOT       : '~' ;
PLUS      : '+' ;
UNEQUAL   : '~=' ;

// Separators (punctuation)
LPAR      : '(' ;
RPAR      : ')' ;
SEMICOLON : ';' ;

// Boolean constants
FALSE     : 'false' ;
TRUE      : 'true' ;

// Other
INTEGER   : [0-9]+ ;
STRING  : [a-zA-Z]+ ;

WS         : [ \n\t\r]+ -> skip ;