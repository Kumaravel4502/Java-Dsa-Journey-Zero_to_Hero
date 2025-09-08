
import java.util.Arrays;

class CycleSort {

    static int[] cycle(int a[]) {
        int i = 0;
        while (i < a.length) {
            int j = a[i] - 1;
            if (a[i] != a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            } else {
                i++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {3, 5, 2, 1, 4};
        cycle(a);
        System.out.println(Arrays.toString(a));
    }
}
