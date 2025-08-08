
import java.util.Scanner;

public class CountDigits {

    static Scanner s = new Scanner(System.in);

    public static int countDigit(int num) {
        int n = num, count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int num = s.nextInt();
        countDigit(num);
        System.out.println(countDigit(num));
    }
}
