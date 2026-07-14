/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * This use case improves UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create a String array to store all lines of the OOPS banner
        String[] lines = new String[7];

        // Populate each line of the array using String.join
        lines[0] = String.join("", " *** ", "  ***** ");
        lines[1] = String.join("", "*   *", " *     *");
        lines[2] = String.join("", "*   *", " *     *");
        lines[3] = String.join("", "*   *", " *     *");
        lines[4] = String.join("", "*   *", " *     *");
        lines[5] = String.join("", "*   *", " *     *");
        lines[6] = String.join("", " *** ", "  ***** ");

        // Print banner using a for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}