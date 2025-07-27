import java.util.Scanner;

public class GCD {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the First Number :");
        int a = s.nextInt();
        System.out.println("Enter the Second Number :");
        int b = s.nextInt();
        int GCD = 1;
        int max = a < b ? a : b;
        for (int i = max;i>=1; i--) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
                break;
            }
        }
        System.out.println("The GCD of " + a + " and " + b + " is : " + GCD);
    }
}
