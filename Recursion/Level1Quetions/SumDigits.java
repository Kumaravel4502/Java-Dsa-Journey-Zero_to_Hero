package Recursion.Level1Quetions;

public class SumDigits {

    public static void main(String[] args) {
        System.out.print("Sum of Digits : ");
        int res = sumOf(5321);
        System.out.println(res);
    }

    static int sumOf(int n) {
        if (n == 0) {
            return 0;  // base case
        }
        return (n % 10) + sumOf(n / 10); // add last digit + sum of remaining digits
    }
}
