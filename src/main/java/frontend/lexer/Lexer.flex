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
{NEWLINE} { return new Symbol(sym.SEP, yychar, yychar+yytext().length()-1); }

"DIM" { return new Symbol(sym.DIM, yychar, yychar+yytext().length()-1); }
"GLOBAL" { return new Symbol(sym.GLOBAL, yychar, yychar+yytext().length()-1); }
"LOCAL" { return new Symbol(sym.LOCAL, yychar, yychar+yytext().length()-1); }
"CONST" { return new Symbol(sym.CONST, yychar, yychar+yytext().length()-1); }
"IF" { return new Symbol(sym.IF, yychar, yychar+yytext().length()-1); }
"THEN" { return new Symbol(sym.THEN, yychar, yychar+yytext().length()-1); }
"ELSE" { return new Symbol(sym.ELSE, yychar, yychar+yytext().length()-1); }
"ELSEIF" { return new Symbol(sym.ELSEIF, yychar, yychar+yytext().length()-1); }
"ENDIF" { return new Symbol(sym.ENDIF, yychar, yychar+yytext().length()-1); }
"SWITCH" { return new Symbol(sym.SWITCH, yychar, yychar+yytext().length()-1); }
"CASE" { return new Symbol(sym.CASE, yychar, yychar+yytext().length()-1); }
"TO" { return new Symbol(sym.TO, yychar, yychar+yytext().length()-1); }
"ENDSWITCH" { return new Symbol(sym.ENDSWITCH, yychar, yychar+yytext().length()-1); }
"WHILE" { return new Symbol(sym.WHILE, yychar, yychar+yytext().length()-1); }
"WEND" { return new Symbol(sym.WEND, yychar, yychar+yytext().length()-1); }
"DO" { return new Symbol(sym.DO, yychar, yychar+yytext().length()-1); }
"UNTIL" { return new Symbol(sym.UNTIL, yychar, yychar+yytext().length()-1); }
"FOR" { return new Symbol(sym.FOR, yychar, yychar+yytext().length()-1); }
"EXITLOOP" { return new Symbol(sym.EXITLOOP, yychar, yychar+yytext().length()-1); }
"FUNC" { return new Symbol(sym.FUNC, yychar, yychar+yytext().length()-1); }
"RETURN" { return new Symbol(sym.RETURN, yychar, yychar+yytext().length()-1); }
"ENDFUNC" { return new Symbol(sym.ENDFUNC, yychar, yychar+yytext().length()-1); }
"AND" { return new Symbol(sym.AND, yychar, yychar+yytext().length()-1); }
"OR" { return new Symbol(sym.OR, yychar, yychar+yytext().length()-1); }
"NOT" { return new Symbol(sym.NOT, yychar, yychar+yytext().length()-1); }
"EXIT" { return new Symbol(sym.EXIT, yychar, yychar+yytext().length()-1); }
"TRUE" { return new Symbol(sym.BOOL_LIT, yychar, yychar+yytext().length()-1); }
"FALSE" { return new Symbol(sym.BOOL_LIT, yychar, yychar+yytext().length()-1); }
"NEXT" { return new Symbol(sym.NEXT, yychar, yychar+yytext().length()-1); }
"STEP" { return new Symbol(sym.STEP, yychar, yychar+yytext().length()-1); }

{DIGIT}+ { return new Symbol(sym.INT_LIT, yychar, yychar+yytext().length()-1); }
{ALPHA}({ALPHA}|{DIGIT})* { System.out.println(yytext());return new Symbol(sym.IDENTIFIER, yychar, yychar+yytext().length()-1); }
\@({ALPHA}|{DIGIT})+ { return new Symbol(sym.STRING_LIT, yychar, yychar+yytext().length()-1);}
\"([^\"]|\"\")*\" { return new Symbol(sym.STRING_LIT, yychar, yychar+yytext().length()-1); }
"#".+"\r\n" {}

"+=" { return new Symbol(sym.ADD_ASSIGN, yychar, yychar+yytext().length()-1); }
"-=" { return new Symbol(sym.SUB_ASSIGN, yychar, yychar+yytext().length()-1); }
"*=" { return new Symbol(sym.MUL_ASSIGN, yychar, yychar+yytext().length()-1); }
"/=" { return new Symbol(sym.DIV_ASSIGN, yychar, yychar+yytext().length()-1); }
"&=" { return new Symbol(sym.AND_ASSIGN, yychar, yychar+yytext().length()-1); }

"+" { return new Symbol(sym.ADD_OP, yychar, yychar+yytext().length()-1); }
"-" { return new Symbol(sym.SUB_OP, yychar, yychar+yytext().length()-1); }
"*" { return new Symbol(sym.MUL_OP, yychar, yychar+yytext().length()-1); }
"/" { return new Symbol(sym.DIV_OP, yychar, yychar+yytext().length()-1); }
"^" { return new Symbol(sym.POW_OP, yychar, yychar+yytext().length()-1); }
"&" { return new Symbol(sym.AND_OP, yychar, yychar+yytext().length()-1); }

"=" { return new Symbol(sym.EQ_OP, yychar, yychar+yytext().length()-1); }
"==" { return new Symbol(sym.EQEQ_OP, yychar, yychar+yytext().length()-1); }
"<>" { return new Symbol(sym.NE_OP, yychar, yychar+yytext().length()-1); }
">" { return new Symbol(sym.GT_OP, yychar, yychar+yytext().length()-1); }
">=" { return new Symbol(sym.GE_OP, yychar, yychar+yytext().length()-1); }
"<" { return new Symbol(sym.LT_OP, yychar, yychar+yytext().length()-1); }
"<=" { return new Symbol(sym.LE_OP, yychar, yychar+yytext().length()-1); }

"?" { return new Symbol(sym.COND, yychar, yychar+yytext().length()-1); }
":" { return new Symbol(sym.COLON, yychar, yychar+yytext().length()-1); }
"$" { return new Symbol(sym.DOLLAR, yychar, yychar+yytext().length()-1); }
"," { return new Symbol(sym.COMMA, yychar, yychar+yytext().length()-1); }

"(" { return new Symbol(sym.LPAREN, yychar, yychar+yytext().length()-1); }
")" { return new Symbol(sym.RPAREN, yychar, yychar+yytext().length()-1); }
"[" { return new Symbol(sym.LBRAC, yychar, yychar+yytext().length()-1); }
"]" { return new Symbol(sym.RBRAC, yychar, yychar+yytext().length()-1); }


. { /* error */ }
}
