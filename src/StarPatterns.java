import java.util.ArrayList;

public class StarPatterns {

    public static void main(String[] args) {
        int n = 5; // Pattern size

        System.out.println("1. Right-Angled Triangle");
        printPattern(generateRightAngledTriangle(n));

        System.out.println("\n2. Inverted Right-Angled Triangle");
        printPattern(generateInvertedRightAngledTriangle(n));

        System.out.println("\n3. Pyramid");
        printPattern(generatePyramid(n));

        System.out.println("\n4. Inverted Pyramid");
        printPattern(generateInvertedPyramid(n));

        System.out.println("\n5. Right-Aligned Triangle");
        printPattern(generateRightAlignedTriangle(n));

        System.out.println("\n6. Left-Aligned Triangle (Inverted)");
        printPattern(generateLeftAlignedInverted(n));

        System.out.println("\n7. Diamond");
        printPattern(generateDiamond(n));

        System.out.println("\n8. Hourglass");
        printPattern(generateHourglass(n));

        System.out.println("\n9. Hollow Pyramid");
        printPattern(generateHollowPyramid(n));

        System.out.println("\n10. Box with Border");
        printPattern(generateBox(n));
    }

    static void printPattern(ArrayList<String> pattern) {
        pattern.forEach(System.out::println);
    }

    static ArrayList<String> generateRightAngledTriangle(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pattern.add("*".repeat(i));
        }
        return pattern;
    }

    static ArrayList<String> generateInvertedRightAngledTriangle(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            pattern.add("*".repeat(i));
        }
        return pattern;
    }

    static ArrayList<String> generatePyramid(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            pattern.add(spaces + stars);
        }
        return pattern;
    }

    static ArrayList<String> generateInvertedPyramid(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            String spaces = " ".repeat(n - i);
            String stars = "*".repeat(2 * i - 1);
            pattern.add(spaces + stars);
        }
        return pattern;
    }

    static ArrayList<String> generateRightAlignedTriangle(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pattern.add(" ".repeat(n - i) + "*".repeat(i));
        }
        return pattern;
    }

    static ArrayList<String> generateLeftAlignedInverted(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            pattern.add("*".repeat(i));
        }
        return pattern;
    }

    static ArrayList<String> generateDiamond(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            pattern.add(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        for (int i = n - 1; i >= 1; i--) {
            pattern.add(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        return pattern;
    }

    static ArrayList<String> generateHourglass(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = n; i >= 1; i--) {
            pattern.add(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        for (int i = 2; i <= n; i++) {
            pattern.add(" ".repeat(n - i) + "*".repeat(2 * i - 1));
        }
        return pattern;
    }

    static ArrayList<String> generateHollowPyramid(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder line = new StringBuilder(" ".repeat(n - i));
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n) {
                    line.append("*");
                } else {
                    line.append(" ");
                }
            }
            pattern.add(line.toString());
        }
        return pattern;
    }

    static ArrayList<String> generateBox(int n) {
        ArrayList<String> pattern = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    line.append("*");
                } else {
                    line.append(" ");
                }
            }
            pattern.add(line.toString());
        }
        return pattern;
    }
}