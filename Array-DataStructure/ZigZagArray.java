
import java.util.Arrays;

public class ZigZagArray {

    public static int[] zigZag(int a[], int b[]) {
        int res[] = new int[a.length + b.length];
        int m = 0, n = 0;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = a[m++];
            } else if (i % 2 == 1) {
                res[i] = b[n++];
            }
        }

        System.out.println("ZigZag Array is : " + Arrays.toString(res));

        return res;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {6, 7, 8, 9, 10};
        zigZag(a, b);
    }
}
