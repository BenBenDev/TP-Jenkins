/**
 * description for KeyboardUtils.
 */
package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * Util : get the keyboard entries.
 */
public final class KeyboardUtils {
    private static Scanner keyboard;

    /**
     * get the keyboard entries.
     * receive : text to display
     * @param displayAsk is the text to display before answering keyboard
     * @return : text entered with keayboard
     */
    public static String readFromKeyboard(String displayAsk) {
        keyboard = new Scanner(System.in);

        System.out.println(displayAsk);
        return keyboard.nextLine();
    }
}
