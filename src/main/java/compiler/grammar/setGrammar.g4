grammar setGrammar;

@header {
package compiler.grammar;
}

ASSIGN : '=';

SET : 'set';
ELEMENT : 'element';
INT_TYPE : 'integer';
STRING_TYPE : 'string';

OPAR : '(';
CPAR : ')';
OANGLEBR : '<';
CANGLEBR : '>';
OBRACKET : '{';
CBRACKET : '}';
COLON : ':';

PUSH : '<-';
PULL : '->';

NEGATION : '!';
CONTAIN : '<?>';
INSERSION : '-';
UNION : '+';
COMPLEMENTS : '/';
CARTESIAN_PRODUCT : '*';
EQ : '==';
NEQ : '!=';
IS : 'is';
PLUS : '+';

IN : 'in';

PRINT : 'print';
PRITTY_PRINT : '<<';

IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOREACH : 'forEach';
SWITCH : 'switch';
CASE : 'case';
DEFAULT : 'default';

MAIN : 'main';
FUNCTION : 'fun';
RETURN : 'return';

parse
 : create* function* main  EOF
 ;

main
 : MAIN OBRACKET start CBRACKET
 ;

start
 : instruction*
 ;

instruction
 : create
 | push_in_set
 | pull_from_set
 | print
 | if_stat
 | while_stat
 | foreach_stat
 | function_call
 | set_operations
 | switch_stat
 ;

set_operations
 : (SET)? ID ASSIGN ID set_operation ID
 ;

set_operation
 : INSERSION            #insersionOperation
 | UNION                #unionOperation
 | COMPLEMENTS          #complementsOperation
 | CARTESIAN_PRODUCT    #cartesianProductOperation
 ;

create
 : create_set
 | create_element
 | create_string
 | create_int
 | set_operations
 ;

create_set
 : (SET)? ID ASSIGN name_object_set
 ;

create_element
 : (ELEMENT)? ID ASSIGN name_object_element
 ;

create_string
 : (STRING_TYPE)? ID ASSIGN name_object_string
 ;

create_int
 : (INT_TYPE)? ID ASSIGN name_object_int
 ;

name_object_set
 : STRING                   #nameObjectSet
 | function_call            #functionCallSet
 | ID                       #idSet
 ;

name_object_element
 : STRING                   #nameObjectElement
 | INT                      #intObjectElement
 | function_call            #functionCallElement
 | ID                       #idElement
 ;

name_object_string
 : STRING #nameObjectString
 ;

name_object_int
 : INT #nameObjectInt
 ;

push_in_set
 : id = ID PUSH push_more
 ;

pull_from_set
 : id = ID PULL pull_more
 ;

push_more
 : ID ',' push_more      #pushMore
 | ID                    #pushOne
 ;

pull_more
 : ID ',' pull_more      #pullMore
 | ID                    #pullOne
 ;

switch_stat
 : SWITCH OPAR ID CPAR OBRACKET case_block* CBRACKET
 ;

case_block
 : CASE value COLON start
 | DEFAULT COLON start
 ;

value
 : ID               #caseId
 | STRING           #caseStr
 | INT              #caseInt
 ;
if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : OPAR (NEGATION)? condition CPAR stat_block
 ;

stat_block
 : OBRACKET start CBRACKET
 ;

while_stat
 : WHILE condition_block
 ;

foreach_stat
 : FOREACH OPAR condition_for_each CPAR stat_block
 ;

condition
 : ID op=(EQ | NEQ) ID                  #equalityExpr
 | ID CONTAIN ID                        #contain
 | ID IS type                           #checkType
 ;

condition_for_each
 : ELEMENT ID IN ID                      #forEachElement
 ;

print
 : PRINT print_expr
 ;

print_expr
 : print_expr PLUS print_expr           #concatString
 | ID                                   #printId
 | STRING                               #printString
 | INT                                  #printInt
 | PRITTY_PRINT ID                      #pretty_print
 ;

function_call
 : ID param_call
 ;

param_call
 : OPAR (arg_call)? CPAR
 ;

arg_call
 : ID                      #paramCallArg
 | ID ',' arg_call         #paramCallArgs
 ;

function
 : FUNCTION ID param stat_block                     #voidFunction
 | FUNCTION type ID param stat_block_with_return    #returnFunction
 ;

stat_block_with_return
 : OBRACKET start return_id CBRACKET
 ;

return_id
 : RETURN ID
 ;

param
 : OPAR (arg)? CPAR
 ;

arg
 : type ID                      #paramArg
 | type ID ',' arg              #paramArgs
 ;

type
 :SET
 |ELEMENT
 |STRING_TYPE
 |INT_TYPE
 ;

INT
 : [0-9]+
 ;

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '//' ~[\r\n]* -> skip
 ;

SPACES
 : [ \t\r\n] -> skip
 ;
