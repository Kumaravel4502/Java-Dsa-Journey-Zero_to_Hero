
import java.util.Arrays;

public class MergeArray {

    public static int[] merge(int a[], int b[]) {
        int m = 0, n = 0;
        int res[] = new int[a.length + b.length];
        for (int i = 0; i < res.length; i++) {
            {
                if (m < a.length) {
                    res[i] = a[m++];
                } else if (n < b.length) {
                    res[i] = b[n++];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int b[] = {60, 70, 80, 90, 100};
        int res[]=  merge(a, b);
        System.out.println("Merged Array: " + Arrays.toString(res));
    }
}
