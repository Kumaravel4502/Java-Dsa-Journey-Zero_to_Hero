package Recursion.Level1Quetions;

public class CountZeros {
    public static void main(String[] args) {
        System.out.print("The Number of Zeros in the number is : ");
        System.out.println(count(302004));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}
