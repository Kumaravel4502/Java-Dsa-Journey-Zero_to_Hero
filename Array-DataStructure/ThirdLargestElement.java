
import java.util.Arrays;

public class ThirdLargestElement {

    public static void third(int a[]) {
        int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE, thirdLarge = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                thirdLarge = secondLarge;
                secondLarge = large;
                large = a[i];
            } else if (a[i] > secondLarge && a[i] < large) {
                thirdLarge = secondLarge;
                secondLarge = a[i];
            } else if (a[i] > thirdLarge && a[i] < secondLarge) {
                thirdLarge = a[i];
            }
        }
        if (thirdLarge == Integer.MIN_VALUE) {
            System.out.println("No Third Largest Element");
        } else {
            System.out.println("Third Largest : " + thirdLarge);
        }
    }

    public static void main(String[] args) {
        int a[] = {10, 50, 90, 80, 60};
        third(a);
        System.out.println("Original Array: " + Arrays.toString(a));
    }
}
