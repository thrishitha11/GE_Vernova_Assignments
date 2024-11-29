import java.util.Scanner;
public class HarmonicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N = sc.nextInt();
        double harmonic = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }
        System.out.println("Nth Harmonic Value: " + harmonic);
    }
}
