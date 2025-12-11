import java.util.*;

public class PrimeSpiral {

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n : ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int need = n * n;
        int num = 2;
        int k = 0;

        // Generate primes and fill matrix row-wise
        while (k < need) {
            if (isPrime(num)) {
                a[k / n][k % n] = num;
                k++;
            }
            num++;
        }


        // Spiral print
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {

            // LEFT → RIGHT
            for (int j = left; j <= right; j++) {
                System.out.print(a[top][j] + " ");
            }
            top++;

            // TOP → BOTTOM
            for (int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // RIGHT → LEFT
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(a[bottom][j] + " ");
                }
                bottom--;
            }

            // BOTTOM → TOP
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}
