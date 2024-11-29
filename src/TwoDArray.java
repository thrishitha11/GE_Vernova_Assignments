import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (N): ");
        int n = sc.nextInt();

        int[][] array = new int[m][n];
        System.out.println("Enter elements of the array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        PrintWriter writer = new PrintWriter(System.out);
        writer.println("The 2D Array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                writer.print(array[i][j] + " ");
            }
            writer.println();
        }
        writer.flush();
    }
}
