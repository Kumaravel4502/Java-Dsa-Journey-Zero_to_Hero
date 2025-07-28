
import java.util.Scanner;

public class PerfectNumber {

    static Scanner s = new Scanner(System.in);

    public static int perfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {

            if (n % i == 0) {
                sum += i;
            }

        }
        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
            return n;
        } else {
            System.out.println(n + " is not a Perfect Number.");
            return 0;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check it is  a perfect Number or not: ");
        int n = s.nextInt();
        perfect(n);
    }
}
