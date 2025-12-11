package CollectionFramework.SoftSauve.QSP;

// inp- 1,2,3,4,5;
// n=1
//op - 1,5,4,3,2

// n=2
//op -- 5,2,4,3,1

import java.util.Arrays;

public class Demo4 {
    public static int[] transform(int[] arr, int n) {
        int idx = n - 1;
        int[] result = new int[arr.length];

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == idx) {
                result[i] = arr[i];
            } else {
                if (j == idx) j--;
                result[i] = arr[j];
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(transform(arr, 1)));
        System.out.println(Arrays.toString(transform(arr, 2)));
    }
}