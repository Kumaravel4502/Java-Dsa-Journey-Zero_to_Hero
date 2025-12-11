package CollectionFramework.SoftSauve.QSP;

import java.util.Arrays;

public class Demo4Clone {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(transform(arr, 1)));
        System.out.println(Arrays.toString(transform(arr, 2)));

    }

    static int[] transform(int arr[], int n) {
        int idx = n - 1;
        int res[] = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == idx) {
                res[i] = arr[i];
            } else {
                if (j == idx) {
                    j--;
                }
                res[i] = arr[j];
                j--;

            }
        }
        return res;
    }
}
