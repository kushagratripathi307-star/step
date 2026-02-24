/**
 * OOPSBannerApp
 *
 * Use Case 4 (UC4):
 * Refactors the banner rendering to use a String array and an enhanced
 * for-loop.
 * This improves code modularity and reusability by separating data from logic.
 *
 * @author Kushagra Tripathi
 * @version 4.0
 */

public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Initialize a String array to store each line of the 7-line "OOPS" banner
        String[] banner = new String[7];

        // Construct each line using String.join() and store it in the array
        banner[0] = String.join(" ", " **** ", " **** ", " **** ", "  **** ");
        banner[1] = String.join(" ", "*    *", "*    *", "*    *", "*      ");
        banner[2] = String.join(" ", "*    *", "*    *", "*    *", "*      ");
        banner[3] = String.join(" ", "*    *", "*    *", "***** ", "  **** ");
        banner[4] = String.join(" ", "*    *", "*    *", "*     ", "      *");
        banner[5] = String.join(" ", "*    *", "*    *", "*     ", "      *");
        banner[6] = String.join(" ", " **** ", " **** ", "*     ", "  **** ");

        // Use an enhanced for-loop to iterate through the array and print each line
        for (String line : banner) {
            System.out.println(line);
        }

    }
}
