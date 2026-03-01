/**
 * OOPSBannerApp
 *
 * Use Case 6 (UC6):
 * Refactors the banner rendering by extracting hardcoded character patterns
 * into reusable static helper methods.
 * This adheres to the DRY principle and improves modularity and
 * maintainability.
 *
 * @author Kushagra Tripathi
 * @version 6.0
 */

public class OOPSBannerApp {

    /**
     * Returns the 7-line string array representation of the letter 'O'
     *
     * @return String array for letter O
     */
    public static String[] getLetterO() {
        return new String[] {
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        };
    }

    /**
     * Returns the 7-line string array representation of the letter 'P'
     *
     * @return String array for letter P
     */
    public static String[] getLetterP() {
        return new String[] {
                " **** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    /**
     * Returns the 7-line string array representation of the letter 'S'
     *
     * @return String array for letter S
     */
    public static String[] getLetterS() {
        return new String[] {
                "  **** ",
                "*      ",
                "*      ",
                "  **** ",
                "      *",
                "      *",
                "  **** "
        };
    }

    /**
     * Main method - Entry point of the application
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Obtain the character arrays using static helper methods
        String[] letterO = getLetterO();
        String[] letterP = getLetterP();
        String[] letterS = getLetterS();

        // Initialize a String array to store each line of the 7-line "OOPS" banner
        String[] banner = new String[7];

        // Construct each line by combining the corresponding lines of each letter
        for (int i = 0; i < banner.length; i++) {
            banner[i] = String.join(" ", letterO[i], letterO[i], letterP[i], letterS[i]);
        }

        // Use an enhanced for-loop to iterate through the array and print each line
        for (String line : banner) {
            System.out.println(line);
        }

    }
}
