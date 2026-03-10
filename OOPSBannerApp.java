import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp
 *
 * Use Case 8 (UC8):
 * Refactors the banner rendering by using a Map Collection to store character
 * patterns.
 * Replaces the array of objects with a centralized Map for better
 * maintainability and scalability.
 * Renders the banner via a dedicated function.
 *
 * @author Kushagra Tripathi
 * @version 8.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the application
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Setup the library of characters using a Map
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[] {
                " **** ",
                "*    *",
                "*    *",
                "*    *",
                "*    *",
                "*    *",
                " **** "
        });

        patternMap.put('P', new String[] {
                " **** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        patternMap.put('S', new String[] {
                "  **** ",
                "*      ",
                "*      ",
                "  **** ",
                "      *",
                "      *",
                "  **** "
        });

        String word = "OOPS";
        renderBanner(word, patternMap);
    }

    /**
     * Renders a banner for the given word using the provided pattern map.
     * 
     * @param word       The word to render
     * @param patternMap The map of character to pattern mappings
     */
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {
        String[] banner = new String[7];

        // Construct each line of the banner using StringBuilder
        for (int i = 0; i < banner.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                // Find the pattern for the current character
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    sb.append(pattern[i]).append(" ");
                } else {
                    // Provide some default spacing if character is not found
                    sb.append("      ");
                }
            }

            banner[i] = sb.toString();
        }

        // Display the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
