/**
 * Application calculatrice.
 * TP Java - gradle - jenkins for IMIE
 */

package com.imie.tp.calculator;
import com.imie.tp.calculator.utils.KeyboardUtils;

/**
 * Application calculatrice.
 * @author BenBen
 *
 */
public class Application {
    /**
     * Main class for application.
     */
    public static void main(String[] args) {
        /**
         * isEnd to quit the application
         */
        boolean isEnd = false;
        do {
        // Process...
        // Display & Ask "Type of Operation ":
        //               - 1 : Addition
        //               - 2 : Subtraction
        //               - 3 : Diviside
        //               - 4 : Multiplication
        //               - 5 : Display History
        //               - 9 : Quit
            System.out.println("Type of Operation :");
            System.out.println("- 1 : Addition");
            System.out.println("- 2 : Subtraction");
            System.out.println("- 3 : Diviside");
            System.out.println("- 4 : Multiplication");
            System.out.println("- 5 : Display History");
            System.out.println("- 9 : Quit");
            
            String val = KeyboardUtils.readFromKeyboard("please enter your choice :");
            
            switch (val) {
            /**
             * case of an addition asked.
             */
            case "1" :
                System.out.println("addition");
                break;
            /**
             *  case of a substraction asked.
             */
            case "2" :
                System.out.println("substraction");
                break;
            /**
            *  Exit is asked.
            */
            case "9" :
                System.out.println("See you...");
                isEnd = true;
                break;
            /**
             *  All other cases (ie. error).
             */
            default :{
                System.out.println("autre choix");
                }
            }
        // If enter 1
        // Display & Ask "Enter Value a : "
        // Display & Ask "Enter Value b : "
        // after
        // Display : result

        // If enter 5
        // Display last calculate :
        //    1 + 1 = 2
        //    2 * 3 = 6

        } while (isEnd == false);
        // If enter 9 => Quit application

        //TODO
        
        System.out.println("END");
    }

}
