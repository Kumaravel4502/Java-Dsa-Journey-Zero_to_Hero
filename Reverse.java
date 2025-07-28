
import java.util.*;

public class Reverse {

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
        System.out.println("Enter the Number to Reverse it : ");
        int n = s.nextInt();
        reverse(n);
    }
}
