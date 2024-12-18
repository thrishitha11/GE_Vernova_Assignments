import java.util.Scanner;

public class LineComparison {

    public static double calcLen(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static boolean isEqual(double len1, double len2) {
        return len1 == len2;
    }

    // Compare two lines
    public static int compare(double len1, double len2) {
        return Double.compare(len1, len2);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line 1 coordinates (x1, y1, x2, y2):");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
        System.out.println("Enter Line 2 coordinates (x1, y1, x2, y2):");
        double x3 = sc.nextDouble(), y3 = sc.nextDouble(), x4 = sc.nextDouble(), y4 = sc.nextDouble();
        double len1 = calcLen(x1, y1, x2, y2);
        double len2 = calcLen(x3, y3, x4, y4);
        System.out.println("Length of Line 1: " + len1);
        System.out.println("Length of Line 2: " + len2);
        if (isEqual(len1, len2)) {
            System.out.println("Lines are equal.");
        } else {
            System.out.println("Lines are not equal.");
        }
        int cmp = compare(len1, len2);
        if (cmp == 0) {
            System.out.println("Lines are equal in length.");
        } else if (cmp > 0) {
            System.out.println("Line 1 is longer than Line 2.");
        } else {
            System.out.println("Line 1 is shorter than Line 2.");
        }
        sc.close();
    }
}
