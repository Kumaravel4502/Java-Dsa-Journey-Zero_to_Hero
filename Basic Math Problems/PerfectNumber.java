
import java.util.*;

class PerfectNumber {

    static Scanner s = new Scanner(System.in);
    static int sum = 0;

    public static int perfectNumber(int n) {

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " is a Perfect number.");
        } else {
            System.out.println(n + " is not a Perfect number.");
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter the Number to Check if it is Perfect or Not: ");
        int n = s.nextInt();
        perfectNumber(n);

    }
}
