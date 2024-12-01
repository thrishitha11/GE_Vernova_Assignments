import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("Triplets that sum to 0 are:");
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total number of triplets: " + count);
    }
}
