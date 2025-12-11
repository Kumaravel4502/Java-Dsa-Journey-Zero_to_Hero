package CollectionFramework.SoftSauve.QSP;

import java.util.*;

public class Fibo {

    // Simple prime check
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Print statements for input
        System.out.print("Enter START value: ");
        int start = sc.nextInt();

        System.out.print("Enter END value: ");
        int end = sc.nextInt();

        System.out.print("Enter LIMIT value: ");
        int limit = sc.nextInt();

        // Generate Fibonacci up to END
        int a = 0, b = 1;
        int sum = 0;

        while (a <= end) {

            // If Fibonacci number falls in the range AND is prime → add to sum
            if (a >= start && a <= end && isPrime(a)) {
                sum += a;
            }

            // Move to next Fibonacci
            int c = a + b;
            a = b;
            b = c;
        }

        // Compare LIMIT with sum
        if (limit < sum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
