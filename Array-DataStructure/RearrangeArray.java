
import java.util.*;

class RearrangeArray {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int b[] = {50, 60, 70, 80};
        int res[]=alterArray(a, b);
        System.out.println("Array : " + Arrays.toString(res));
    }

    public static int[] alterArray(int a[], int b[]) {
        int res[] = new int[a.length + b.length];
        int m = 0, n =b.length-1;
        for (int i = 0; i < res.length; i++) {
            if (i % 2 == 0) {
                res[i] = a[m++];
            }
            else {
                res[i] = b[n--];
            }

        }
        return res;
    }
}
