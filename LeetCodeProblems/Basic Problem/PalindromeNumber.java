
import java.util.Scanner;

public class PalindromeNumber {

    static Scanner s = new Scanner(System.in);

    public static boolean isPalindrome(int num) {
        int n = num;
        int rem, rev = 0;
        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return num == rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int num = s.nextInt();
        System.out.println(isPalindrome(num));
    }
}
