import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int flips = sc.nextInt();
        int heads = 0;

        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) {
                heads++;
            }
        }
        System.out.println("Heads: " + (heads * 100.0 / flips) + "%");
        System.out.println("Tails: " + ((flips - heads) * 100.0 / flips) + "%");
    }
}
