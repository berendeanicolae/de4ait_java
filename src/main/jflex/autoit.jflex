
%%

%public

%class Lexer
%type Object

%line
%column

L = [a-zA-z_]
D = [0-9]

%% 

#.+ { System.out.println("Comment skipped" + yytext()); }

\${L}({L}|{D})* { System.out.println("Identifier <" + yytext() + ">"); }
{L}({L}|{D})* { System.out.println(""); }

"=" { System.out.println("EQ"); }

\"(\\.|[^\"])*\" { System.out.println("String literal <" + yytext() + ">");}

\n { System.out.println("new line"); }

. { System.out.println("Invalid character <" + yytext() + ">"); }