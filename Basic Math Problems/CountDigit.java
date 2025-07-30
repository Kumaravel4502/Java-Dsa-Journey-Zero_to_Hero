
import java.util.*;

public class CountDigit {

    static int count = 1;
    static Scanner s = new Scanner(System.in);

    public static int countD(int n) {
        for (int i = 1; i < n; i++) {
            int rem = n % 10;
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number to Count its Digit : ");
        int n = s.nextInt();
        System.out.println("The Count of Number is : " + countD(n));

    }
}
