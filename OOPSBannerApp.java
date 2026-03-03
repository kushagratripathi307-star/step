/**
 * OOPSBannerApp
 *
 * Use Case 7 (UC7):
 * Refactors the banner rendering by encapsulating character patterns into a
 * static inner class CharacterPatternMap.
 * Replaces separate helper methods with a modular system utilizing
 * constructors, getters, and StringBuilder.
 *
 * @author Kushagra Tripathi
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Static inner class to encapsulate character data and its corresponding banner
     * pattern.
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        /**
         * Constructor
         * 
         * @param character The character
         * @param pattern   The 7-line banner pattern for the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for the character
         * 
         * @return The character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for the pattern array
         * 
         * @return The 7-line string array pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Main method - Entry point of the application
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Setup the library of characters
        CharacterPatternMap[] mappings = {
                new CharacterPatternMap('O', new String[] {
                        " **** ",
                        "*    *",
                        "*    *",
                        "*    *",
                        "*    *",
                        "*    *",
                        " **** "
                }),
                new CharacterPatternMap('P', new String[] {
                        " **** ",
                        "*    *",
                        "*    *",
                        "***** ",
                        "*     ",
                        "*     ",
                        "*     "
                }),
                new CharacterPatternMap('S', new String[] {
                        "  **** ",
                        "*      ",
                        "*      ",
                        "  **** ",
                        "      *",
                        "      *",
                        "  **** "
                })
        };

        String word = "OOPS";
        String[] banner = new String[7];

        // Construct each line of the banner using StringBuilder
        for (int i = 0; i < banner.length; i++) {
            StringBuilder sb = new StringBuilder();

            for (char c : word.toCharArray()) {
                // Find the pattern for the current character
                for (CharacterPatternMap map : mappings) {
                    if (map.getCharacter() == c) {
                        sb.append(map.getPattern()[i]).append(" ");
                        break;
                    }
                }
            }

            banner[i] = sb.toString();
        }

        // Display the "OOPS" banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
