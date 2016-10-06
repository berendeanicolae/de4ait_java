package intermediate.symtabimpl;

import intermediate.*;

import java.util.ArrayList;

/**
 * SymTabStackImpl
 *
 * An implementation of the symbol table stack.
 */
public class SymTabStackImpl extends ArrayList<SymTab> implements SymTabStack {
    private int currentNestingLevel; // current scope nesting level

    /**
     * Constructor
     */
    public SymTabStackImpl() {
        currentNestingLevel = 0;
        add(SymTabFactory.createSymTab(currentNestingLevel));
    }

    /**
     * Getter.
     * @return the current nesting level.
     */
    @Override
    public int getCurrentNestingLevel() {
        return currentNestingLevel;
    }

    /**
     * Return the local symbol table (the one which is at the top of the stack).
     * @return the local symbol table.
     */
    @Override
    public SymTab getLocalSymTab() {
        return get(currentNestingLevel);
    }

    /**
     * Create and enter a new entry into the local symbol table.
     * @param name the name of the entry.
     * @return the new entry.
     */
    @Override
    public SymTabEntry enterLocal(String name) {
        return get(currentNestingLevel).enter(name);
    }

    /**
     * Look up an existing symbol table entry through the stack.
     * @param name the name of the entry.
     * @return the entry, or null if it doesn't exist.
     */
    @Override
    public SymTabEntry lookupLocal(String name) {
        return get(currentNestingLevel).lookup(name);
    }

    /**
     * Look up an existing symbol table entry through the stack.
     * @param name the name of the entry.
     * @return the entry, or null if it doesn't exist.
     */
    @Override
    public SymTabEntry lookup(String name) {
        return lookupLocal(name);
    }
}
