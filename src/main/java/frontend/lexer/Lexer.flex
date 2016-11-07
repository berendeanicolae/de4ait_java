package frontend.lexer;

import java_cup.runtime.*;
import frontend.parser.sym;

%%

%public

%class Lexer
%type Symbol
%cup
%line
%column

NEWLINE     = \r|\n|\r\n
WHITESPACE  = [ \t\f]
DIGIT       = [0-9]
ALPHA       = [a-zA-Z_]

%%

<YYINITIAL> {
{WHITESPACE} { /* ignore */ }
{NEWLINE} { /* ignore */ }

// ${ALPHA}({ALPHA}|{DIGIT})* {}
{DIGIT}+ {}

. { /* error */ }
}