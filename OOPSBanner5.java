public class OOPSBanner5 {

    // Method to build pattern for 'O'
    public static String[] getOPattern() {
        return new String[]{
                " *****   ",
                "**   **  ",
                "**   **  ",
                "**   **  ",
                "**   **  ",
                "**   **  ",
                " *****   "
        };
    }

    // Method to build pattern for 'P'
    public static String[] getPPattern() {
        return new String[]{
                "******   ",
                "**    ** ",
                "**    ** ",
                "******   ",
                "**       ",
                "**       ",
                "**       "
        };
    }

    // Method to build pattern for 'S'
    public static String[] getSPattern() {
        return new String[]{
                " ******  ",
                "**        ",
                "**        ",
                " *****    ",
                "      **  ",
                "      **  ",
                " ******   "
        };
    }

    public static void main(String[] args) {

        // Initialize patterns
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Assemble banner
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i];
        }

        // Print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}