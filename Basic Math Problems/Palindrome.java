
import java.util.*;

public class Palindrome {

    static Scanner s = new Scanner(System.in);
    static int rev = 0, rem;

    public static int reverse(int n) {
        System.out.print("Reversed Number is : ");
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev);
        return rev;
    }

    public static void main(String[] args) {
        System.out.print("Enter the Number to Reverse it : ");
        int n = s.nextInt();
        reverse(n);
        int original = n;
        if (original == rev) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }
    }
}
