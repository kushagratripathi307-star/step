/**
 * OOPSBannerApp
 *
 * Use Case 5 (UC5):
 * Refactors the banner rendering to combine array declaration and
 * initialization
 * using String.join() method calls for a more concise syntax.
 *
 * @author Kushagra Tripathi
 * @version 5.0
 */

public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Initialize and declare a String array for the 7-line "OOPS" banner using
        // array initializer syntax
        String[] banner = {
                String.join(" ", " **** ", " **** ", " **** ", "  **** "),
                String.join(" ", "*    *", "*    *", "*    *", "*      "),
                String.join(" ", "*    *", "*    *", "*    *", "*      "),
                String.join(" ", "*    *", "*    *", "***** ", "  **** "),
                String.join(" ", "*    *", "*    *", "*     ", "      *"),
                String.join(" ", "*    *", "*    *", "*     ", "      *"),
                String.join(" ", " **** ", " **** ", "*     ", "  **** ")
        };

        // Use an enhanced for-loop to iterate through the array and print each line
        for (String line : banner) {
            System.out.println(line);
        }

    }
}
