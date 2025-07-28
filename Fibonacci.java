
import java.util.Scanner;

public class Fibonacci {

    static Scanner s = new Scanner(System.in);

    static int a = -1, b = 1, c;

    public static int fibo(int n) {
        System.out.println("Fibonacci Series: ");

        for (int i = 0; i < n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to find its Fibonacci Series: ");
        int n = s.nextInt();
        fibo(n);
    }

}
