
import java.util.Scanner;

class PowerOfNumber {

    static Scanner s = new Scanner(System.in);

    // public static int power(int base, int exponent) {
    //     if (exponent == 0) {
    //         return 1;
    //     }
    //     return base * power(base, exponent - 1);
    // }
    // public static void main(String[] args) {
    //     System.out.println("Enter the Base Number : ");
    //     int base = s.nextInt();
    //     System.out.println("Enter the Power Number : ");
    //     int exponent = s.nextInt();
    //     System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + power(base, exponent));
    // }

    //========================================================================
    
    // OR
    public static void main(String[] args) {
        int product = 1, x = 5, n = 3, temp = n;
        while (n > 0) {
            product *= x;
            n--;
        }
        System.out.println("The result of " + x + " raised to the power of " + temp + " is: " + product);
    }
}
