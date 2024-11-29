public class PowerOf2 {
    public static void main(String[] args) {
        int N = 5;
        if (N < 0 || N >= 31) {
            System.out.println("Invalid input. N should be between 0 and 30.");
            return;
        }
        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
}
