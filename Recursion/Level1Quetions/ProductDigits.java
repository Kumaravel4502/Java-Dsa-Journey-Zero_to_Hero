package Recursion.Level1Quetions;

public class ProductDigits {
    public static void main(String[] args) {
        System.out.print("Product of Digits: ");
        int res = prodOf(123);
        System.out.println(res);
    }

    static int prodOf(int n) {
        if (n % 10 == n) {  // base case: single digit
            return n;
        }
        return (n % 10) * prodOf(n / 10);  // multiply last digit * product of remaining digits
    }
}
