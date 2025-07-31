
import java.util.Arrays;

public class ReverseArray {

    public static int[] reverse(int[] a) {
        int res[] = new int[a.length];
        // for (int i = res.length - 1; i >= 0; i--) {
        for (int i = 0; i < res.length; i++) {

            res[i] = a[a.length - 1 - i];
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + Arrays.toString(a));
        int res[] = reverse(a);
        System.out.println("Reversed Array: " + Arrays.toString(res));
    }
}
