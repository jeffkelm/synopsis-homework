grammar Calculator;

options {
    language=Java;
}

/* Use labels to generate visitor methods. */
mathFunc :
	'add(' mathFuncArg ',' mathFuncArg ')'                   # add
	| 'sub(' mathFuncArg ',' mathFuncArg ')'                 # sub
	| 'mult(' mathFuncArg ',' mathFuncArg ')'                # mult
	| 'div(' mathFuncArg ',' mathFuncArg ')'                 # div
	| 'let(' Var ',' (Num | mathFunc) ',' mathFunc ')'         # let
	;

/* The caveat here is that Var can only appear here if there is a let function wrapping the math function making use of this mathFuncArg. As well, the value of that Var must be defined by a surrounding let function. I'm learning Antlr specifically for this task, but I will attempt to use a Visitor to handle this. */
mathFuncArg : Var                                            # varArg
	| Num                                                    # numArg
	| mathFunc                                               # funcArg
	;

Var : [a-zA-Z]+;
Num : ('0'..'9')+;

/* Remove all whitespace. */
WhiteSpace : (' '|'\t') -> skip;
NewLine : ('\r'?'\n'|'\r') -> skip;