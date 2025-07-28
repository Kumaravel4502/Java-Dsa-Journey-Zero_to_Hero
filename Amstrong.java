
import java.util.*;

public class Amstrong {

    static Scanner s = new Scanner(System.in);
    static int count = 0, temp, sum = 0;

    public static int countDigits(int n) {
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println("Number of digits: " + count);
        return count;
    }

    public static int amstrong(int n) {
        countDigits(n);
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.print("Enter  a Number to Check if it is Armstrong or Not: ");
        int n = s.nextInt();
        int result = amstrong(n);
        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }
}
