/*
Write a program for matrix prime number print in spiral way
Input 3
Output 2,3,5,13,23,19,17,7,11
Explaination
3*3 matrix
[[2, 3, 5],
[7, 11, 13],
[17, 19, 23]]

2,3,5,13,23,19,17,7,11


 */

//package CollectionFramework.SoftSauve.QSP;
//
//public class MatrixPrime {
//}


import java.util.*;

public class PrimeSpiralMatrix {

    // Check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Generate first k prime numbers
    static List<Integer> generatePrimes(int k) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;

        while (primes.size() < k) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    // Fill matrix row-wise
    static int[][] fillMatrix(int n, List<Integer> primes) {
        int[][] mat = new int[n][n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = primes.get(idx++);
            }
        }
        return mat;
    }

    // Spiral order printing
    static List<Integer> spiralPrint(int[][] mat, int n) {
        List<Integer> ans = new ArrayList<>();

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int j = left; j <= right; j++) {
                ans.add(mat[top][j]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Right → Left
                for (int j = right; j >= left; j--) {
                    ans.add(mat[bottom][j]);
                }
                bottom--;
            }

            if (left <= right) {
                // Bottom → Top
                for (int i = bottom; i >= top; i--) {
                    ans.add(mat[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Example: 3

        int total = n * n;
        List<Integer> primes = generatePrimes(total);

        int[][] matrix = fillMatrix(n, primes);
        List<Integer> spiral = spiralPrint(matrix, n);

        // Printing matrix (optional)
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        // Printing spiral output
        System.out.println("\nSpiral Output:");
        for (int x : spiral) {
            System.out.print(x + " ");
        }
    }
}
