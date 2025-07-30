
import java.util.Scanner;
public class LCM {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the First Number :");
        int a = s.nextInt();
        System.out.println("Enter the Second Number :");
        int b = s.nextInt();
        int lcm = 0;
        int max = a > b ? a : b;
        for (int i = max;; i++) {
            if (i % a == 0 && i % b == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The LCM of " + a + " and " + b + " is : " + lcm);
    }
}

