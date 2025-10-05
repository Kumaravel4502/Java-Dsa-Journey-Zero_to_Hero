package Recursion.Level1Quetions;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("The factorial of the number is : ");
        int res = fact(5);
        System.out.println(res);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

