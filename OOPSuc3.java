/**
 * OOPSBannerApp - Use Case 3
 * Prints the OOPS banner using String.join()
 * to improve memory efficiency and readability.
 *
 * @author fiona
 * @version 3.0
 */
public class OOPSuc3 {

    public static void main(String[] args) {

        String line1 = String.join("   ",
                " *** ",
                " *** ",
                "**** ",
                "**** "
        );

        String line2 = String.join("   ",
                "*   *",
                "*   *",
                "*   *",
                "*   *"
        );

        String line3 = String.join("   ",
                "*   *",
                "*   *",
                "**** ",
                " *** "
        );

        String line4 = String.join("   ",
                "*   *",
                "*   *",
                "*    ",
                "    *"
        );

        String line5 = String.join("   ",
                " *** ",
                " *** ",
                "*    ",
                "**** "
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}