package intermediate;

/**
 * SymTabStack
 *
 * The interface for the symbol table stack.
 */
public interface SymTabStack {
    /**
     * Getter.
     * @return the current nesting level.
     */
    public int getCurrentNestingLevel();

    /**
     * Return the local symbol table (the one which is at the top of the stack).
     * @return the local symbol table.
     */
    public SymTab getLocalSymTab();

    /**
     * Create and enter a new entry into the local symbol table.
     * @param name the name of the entry.
     * @return the new entry.
     */
    public SymTabEntry enterLocal(String name);

    /**
     * Look up an existing symbol table entry in the local symbol table.
     * @param name the name of the entry.
     * @return the entry, or null if it doesn't exist.
     */
    public SymTabEntry lookupLocal(String name);

    /**
     * Look up an existing symbol table entry through the stack.
     * @param name the name of the entry.
     * @return the entry, or null if it doesn't exist.
     */
    public SymTabEntry lookup(String name);
}
