
import java.util.*;

public class Prime {

    static Scanner s = new Scanner(System.in);
    static int Prime;

    public static int primeNum(int Prime) {
        for (int i = 1; i < Prime; i++) {
            if (Prime % i == 0 && i != 1 && i != Prime) {
                System.out.println("Not  A Prime");
                return 0;
            }
        }
        System.out.println("Prime Number");
        return Prime;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number to Check it is Prime or Not : ");
        Prime = s.nextInt();
        primeNum(Prime);
    }
}
