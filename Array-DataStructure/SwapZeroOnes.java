
import java.util.*;

public class SwapZeroOnes {

    static int[] swap(int a[]) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            if (a[left] == 0 && a[right] == 1) {
                //Swap
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (a[left] == 1) {
                left++;
            } else if (a[right] == 0) {
                right--;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {0, 1, 0, 0, 1, 1, 0, 1};
        swap(a);
        System.out.println("Array after swap: " + Arrays.toString(a));

    }
}
