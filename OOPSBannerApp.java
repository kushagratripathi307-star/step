/**
 * OOPSBannerApp
 *
 * Use Case 3 (UC3):
 * Refactors the banner rendering to use String.join() for constructing each
 * line.
 * This improves memory efficiency by avoiding the '+' operator for string
 * concatenation.
 *
 * @author Kushagra Tripathi
 * @version 3.0
 */

public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Print 7-line ASCII banner for "OOPS" using String.join()
        // Each line is constructed by joining string segments representing parts of
        // each letter.

        System.out.println(String.join(" ", " **** ", " **** ", " **** ", "  **** "));
        System.out.println(String.join(" ", "*    *", "*    *", "*    *", "*      "));
        System.out.println(String.join(" ", "*    *", "*    *", "*    *", "*      "));
        System.out.println(String.join(" ", "*    *", "*    *", "***** ", "  **** "));
        System.out.println(String.join(" ", "*    *", "*    *", "*     ", "      *"));
        System.out.println(String.join(" ", "*    *", "*    *", "*     ", "      *"));
        System.out.println(String.join(" ", " **** ", " **** ", "*     ", "  **** "));

    }
}
