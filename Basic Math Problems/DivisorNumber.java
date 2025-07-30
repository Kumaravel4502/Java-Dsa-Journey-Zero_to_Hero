
import java.util.*;

public class DivisorNumber {

    static Scanner s = new Scanner(System.in);

    public static int divisor(int n) {
        System.out.println("The Divisors of " + n + " is :");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number to Print its divisors : ");
        int n = s.nextInt();
        divisor(n);
    }
}
