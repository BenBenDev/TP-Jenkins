/**
 * HistoryManager has the history of each operation.
 */
package com.imie.tp.calculator.utils;

import java.util.ArrayList;

/**
 * HistoryManager has the history of each operation.
 */
public final class HistoryManager {

    /**
     * field declaration. History of operations.
     */
    private final ArrayList<String> cache = new ArrayList<String>();
    
    /**
     * description to be written.
     */
    private static final HistoryManager instance = new HistoryManager();
    
    /**
     * this is a method.
     * @return some instance
     */
    public static HistoryManager getInstance() {
        return instance;
    }

    /**
     * initializing.
     */
    private HistoryManager() { }

    

    /**
     * adds an operation in the history.
     * @param operation is an operation to add in history
     */
    public final void addOperation(String operation) {
        this.cache.add(operation);
    }

    /**
     * clears all operation in the history.
     */
    public void clear() {
        this.cache.clear();
    }

    /**
     * checks the history and returns it.
     * @return a text with all history
     */
    public String getHistory() {
        final StringBuilder stringBuilder = new StringBuilder();

        for (final String string : cache) {
            stringBuilder.append(string + "\n");
        }

        return stringBuilder.toString();
    }

}
