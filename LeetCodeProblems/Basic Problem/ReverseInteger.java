
import java.util.Scanner;

public class ReverseInteger {

    static Scanner s = new Scanner(System.in);

    public static int reverse(int nums) {
        int rev = 0, rem, n = nums;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && rem > 7) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || rev == Integer.MIN_VALUE / 10 && rem < -8) {
                return 0;
            }
            rev = rev * 10 + rem;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number to Reverse it : ");
        int nums = s.nextInt();
        reverse(nums);
        System.out.println("Reversed Number is : " + reverse(nums));
    }
}
