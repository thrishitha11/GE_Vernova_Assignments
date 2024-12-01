import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if ("aeiou".indexOf(ch) >= 0) {
            System.out.println(ch + " is a Vowel.");
        } else if (Character.isAlphabetic(ch)) {
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
