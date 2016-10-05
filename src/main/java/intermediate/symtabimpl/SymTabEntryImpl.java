package intermediate.symtabimpl;

import intermediate.SymTab;
import intermediate.SymTabEntry;
import intermediate.SymTabKey;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * SymTabEntryImpl
 *
 * An implementation of the symbol table entry.
 */
public class SymTabEntryImpl extends HashMap<SymTabKey, Object> implements SymTabEntry{
    private String name; // entry name
    private SymTab symTab; // parent symbol table
    private ArrayList<Integer> lineNumbers; // source line numbers

    /**
     * Constructor
     * @param name the name of the entry.
     * @param symTab the symbol table that contains this entry.
     */
    public SymTabEntryImpl(String name, SymTabImpl symTab) {
        this.name = name;
        this.symTab = symTab;
        lineNumbers = new ArrayList<>();
    }

    /**
     * Getter
     * @return the name of the entry.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Getter
     * @return the symbol table that contains the entry.
     */
    @Override
    public SymTab getSymTab() {
        return null;
    }

    /**
     * Append a source line number to the entry.
     * @param lineNumber the line number to append
     */
    @Override
    public void appendLineNumber(int lineNumber) {
        lineNumbers.add(lineNumber);
    }

    /**
     * Getter
     * @return the list of source line numbers.
     */
    @Override
    public ArrayList<Integer> getLineNumbers() {
        return null;
    }

    /**
     * Set an attribute of the entry.
     * @param key the attribute key.
     * @param value the attribute value.
     */
    @Override
    public void setAttribute(SymTabKey key, Object value) {
        put(key, value);
    }

    /**
     * Get the value of an attribute of the entry.
     * @param key the attribute key.
     * @return the attribute value.
     */
    @Override
    public Object getAttribute(SymTabKey key) {
        return get(key);
    }
}
