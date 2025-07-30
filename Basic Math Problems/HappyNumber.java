
import java.util.*;

public class HappyNumber {

    static Scanner s = new Scanner(System.in);
    static int sum = 0, last;

    public static int happ(int n) {
        while (n > 0) {
            last = n % 10;
            sum += (last * last);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number to check Happy Number or Not :");
        int n = s.nextInt();

        while (n != 1 && n != 4) {
            n = happ(n);
            sum = 0;
        }
        if (happ(n) == 1) {
            System.out.println("The Number is Happy Number");
        } else {
            System.out.println("The Number is Not a Happy Number");
        }
    }
}
