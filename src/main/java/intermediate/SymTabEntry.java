package intermediate;

import java.util.ArrayList;

/**
 * SymTabEntry
 *
 * The interface for a symbol table entry.
 */
public interface SymTabEntry {
    /**
     * Getter
     * @return the name of the entry.
     */
    public String getName();

    /**
     * Getter
     * @return the symbol table that contains the entry.
     */
    public SymTab getSymTab();

    /**
     * Append a source line number to the entry.
     * @param lineNumber the line number to append
     */
    public void appendLineNumber(int lineNumber);

    /**
     * Getter
     * @return the list of source line numbers.
     */
    public ArrayList<Integer> getLineNumbers();

    /**
     * Set an attribute of the entry.
     * @param key the attribute key.
     * @param value the attribute value.
     */
    public void setAttribute(SymTabKey key, Object value);

    /**
     * Get the value of an attribute of the entry.
     * @param key the attribute key.
     * @return the attribute value.
     */
    public Object getAttribute(SymTabKey key);
}
