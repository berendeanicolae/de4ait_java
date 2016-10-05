package intermediate.symtabimpl;

import intermediate.SymTabKey;

/**
 * SymTabKeyImpl
 *
 * Attribute keys for a symbol table entry.
 */
public enum SymTabKeyImpl implements SymTabKey{
    // constant
    CONSTANT_VALUE,

    // procedure or function
    // ROUTINE_CODE, ROUTINE_SYMTAB, ROUTINE_ICODE, ROUTINE_PARMS, ROUTINE_ROUTINES,

    // variable or record field value
    DATA_VALUE
}
