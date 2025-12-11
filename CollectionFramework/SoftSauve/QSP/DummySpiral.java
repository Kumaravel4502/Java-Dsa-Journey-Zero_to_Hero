package CollectionFramework.SoftSauve.QSP;

import java.util.*;

public class DummySpiral {

    // --------- Utility: isPrime ----------
    public static boolean isPrime(int n) {
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

    // --------- Task: generate first n^2 primes, fill matrix row-wise and print spiral ----------
    public static void printPrimeMatrixSpiral(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }

        int need = n * n;
        int[][] a = new int[n][n];
        int num = 2;
        int k = 0;

        // generate primes and fill matrix row-wise
        while (k < need) {
            if (isPrime(num)) {
                int r = k / n;
                int c = k % n;
                a[r][c] = num;
                k++;
            }
            num++;
        }

        // spiral print
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        StringBuilder out = new StringBuilder();

        while (top <= bottom && left <= right) {

            // left -> right on top row
            for (int j = left; j <= right; j++) {
                out.append(a[top][j]).append(" ");
            }
            top++;

            // top -> bottom on right column
            for (int i = top; i <= bottom; i++) {
                out.append(a[i][right]).append(" ");
            }
            right--;

            // right -> left on bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    out.append(a[bottom][j]).append(" ");
                }
                bottom--;
            }

            // bottom -> top on left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    out.append(a[i][left]).append(" ");
                }
                left++;
            }
        }

        // print single-line spiral
        System.out.println(out.toString().trim());
    }

    // main to run from command line
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int n = sc.nextInt();
        printPrimeMatrixSpiral(n);
    }
}
