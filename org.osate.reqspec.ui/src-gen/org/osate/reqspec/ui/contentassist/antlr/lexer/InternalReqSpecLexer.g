
/*
* generated by Xtext
*/
lexer grammar InternalReqSpecLexer;


@header {
package org.osate.reqspec.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




Specification : ('S'|'s')('P'|'p')('E'|'e')('C'|'c')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Description : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Requirement : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

Stakeholder : ('S'|'s')('T'|'t')('A'|'a')('K'|'k')('E'|'e')('H'|'h')('O'|'o')('L'|'l')('D'|'d')('E'|'e')('R'|'r');

Conflicts : ('C'|'c')('O'|'o')('N'|'n')('F'|'f')('L'|'l')('I'|'i')('C'|'c')('T'|'t')('S'|'s');

Constants : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('T'|'t')('S'|'s');

Mitigates : ('M'|'m')('I'|'i')('T'|'t')('I'|'i')('G'|'g')('A'|'a')('T'|'t')('E'|'e')('S'|'s');

Rationale : ('R'|'r')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l')('E'|'e');

Category : ('C'|'c')('A'|'a')('T'|'t')('E'|'e')('G'|'g')('O'|'o')('R'|'r')('Y'|'y');

Document : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

Include : ('I'|'i')('N'|'n')('C'|'c')('L'|'l')('U'|'u')('D'|'d')('E'|'e');

Refines : ('R'|'r')('E'|'e')('F'|'f')('I'|'i')('N'|'n')('E'|'e')('S'|'s');

Section : ('S'|'s')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

Assert : ('A'|'a')('S'|'s')('S'|'s')('E'|'e')('R'|'r')('T'|'t');

Folder : ('F'|'f')('O'|'o')('L'|'l')('D'|'d')('E'|'e')('R'|'r');

Goals : ('G'|'g')('O'|'o')('A'|'a')('L'|'l')('S'|'s');

Goal : ('G'|'g')('O'|'o')('A'|'a')('L'|'l');

This : ('T'|'t')('H'|'h')('I'|'i')('S'|'s');

With : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

For : ('F'|'f')('O'|'o')('R'|'r');

See : ('S'|'s')('E'|'e')('E'|'e');

ExclamationMarkEqualsSign : '!''=';

FullStopAsterisk : '.''*';

ColonColon : ':'':';

LessThanSignEqualsSign : '<''=';

GreaterThanSignEqualsSign : '>''=';

NumberSign : '#';

PercentSign : '%';

Ampersand : '&';

FullStop : '.';

Solidus : '/';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



