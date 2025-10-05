package Recursion;

public class NumbersProgram {
    // Write  a function to take a input and print first 5 numbers

    public static void main(String[] args) {
        number(1);
    }

    static void number(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        number(n + 1);
    }

}
