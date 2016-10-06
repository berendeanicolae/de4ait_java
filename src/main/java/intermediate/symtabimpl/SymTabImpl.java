package intermediate.symtabimpl;

import intermediate.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

/**
 * SymTabImpl
 *
 * An implementation of the symbol table.
 */
public class SymTabImpl extends TreeMap<String, SymTabEntry> implements SymTab {
    private int nestingLevel; // nesting level of this symbol table

    /**
     * Constructor
     * @param nestingLevel the nesting level of the symbol table.
     */
    public SymTabImpl(int nestingLevel) {
        this.nestingLevel = nestingLevel;
    }

    /**
     * Getter
     * @return the scope nesting level of this entry.
     */
    @Override
    public int getNestingLevel() {
        return 0;
    }

    /**
     * Create and enter a new entry into the symbol table.
     * @param name the name of the entry.
     * @return the new entry.
     */
    @Override
    public SymTabEntry enter(String name) {
        SymTabEntry entry = SymTabFactory.createSymTabEntry(name, this);
        put(name, entry);

        return entry;
    }

    /**
     * Look up an existing symbol table entry.
     * @param name the name of the entry.
     * @return the entry, or null if it doesn't exist.
     */
    @Override
    public SymTabEntry lookup(String name) {
        return get(name);
    }

    /**
     * @return a list of symbol table entries sorted by name.
     */
    @Override
    public ArrayList<SymTabEntry> sortedEntries() {
        Iterator<SymTabEntry> iter = values().iterator();
        ArrayList<SymTabEntry> list = new ArrayList<>(size());

        while (iter.hasNext()) {
            list.add(iter.next());
        }

        return list;
    }
}
