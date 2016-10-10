package frontend.autoit;

import frontend.TokenType;

/**
 * AutoitTokenType
 *
 * Autoit token types
 */
public enum AutoitTokenType implements TokenType {
    // Reserved words
    CALL,
    LOCAL,
    DLLSTRUCTCREATE,
    DLLSTRUCTSETDATA,
    DLLCALL,
    FUNC,
    ENDFUNC,
    RETURN,
    IF,
    THEN,
    ELSE,
    ENDIF,
    SWITCH,
    CASE,
    ENDSWITCH,
    FOR,
    TO,
    NEXT,
    WHILE,
    WEND,

    // Symbols
    // '+',
    PLUS,
    MINUS,
    STAR,
    SLASH,

    ASSIGN,
    NOT_EQUAL,
    LESS_THAN,
    LESS_EQUALS,
    GREATER_THAN,
    GREATER_EQUALS,
    LEFT_PAREN,
    RIGHT_PAREN,
    LEFT_BRACKET,
    RIGHT_BRACKET,

    ADD_ASSIGN,
}
