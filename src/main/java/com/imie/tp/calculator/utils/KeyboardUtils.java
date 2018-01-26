/**
 * description for KeyboardUtils
 */
package com.imie.tp.calculator.utils;

import java.util.Scanner;

/**
 * Util : get the keyboard entries.
 */
public final class KeyboardUtils {
    /**
     * get the keyboard entries.
     * receive : text to display
     * @return : text entered with keayboard
     */
    public static String readFromKeyboard(String displayAsk) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(displayAsk);
        keyboard.close();
        return keyboard.nextLine();
    }
}
