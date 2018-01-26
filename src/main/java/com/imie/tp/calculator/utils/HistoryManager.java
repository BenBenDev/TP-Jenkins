/**
 * HistoryManager has the history of each operation.
 */
package com.imie.tp.calculator.utils;

import java.util.ArrayList;

/**
 * HistoryManager has the history of each operation.
 */
public class HistoryManager {

    // Singleton
    private static final HistoryManager instance = new HistoryManager();
    public static HistoryManager getInstance() {
        return instance;
    }

    /**
     * initializing.
     */
    private HistoryManager() { }

    private ArrayList<String> cache = new ArrayList<String>();

    /**
     * adds an operation in the history.
     * @param operation is an operation to add in history
     */
    public void addOperation(String operation) {
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
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : cache) {
            stringBuilder.append(string + "\n");
        }

        return stringBuilder.toString();
    }

}
