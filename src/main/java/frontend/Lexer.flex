package frontend;

import java_cup.runtime.*;

%%

%public

%class Lexer
%type Token
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

{ALPHA}({ALPHA}|{DIGIT})* {}
{DIGIT}+ {}

. { /* error */ }
}