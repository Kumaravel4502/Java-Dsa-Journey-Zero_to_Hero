package SelectionSort;

import java.util.*;

class SelectionSort {

    static void swap(int[] a, int first, int last) {
        int temp = a[first];
        a[first] = a[last];
        a[last] = temp;
    }

    static int getMaxIndex(int a[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
    }



    public static void selection(int a[]) {
        for (int i = 0; i < a.length; i++) {
            //find max item in the array and swap with correct index

            int last = a.length - 1 - i;
            int maxIndex = getMaxIndex(a, 0, last);
            swap(a, maxIndex, last);

        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 2, 1, 4};
        selection(a);
    }

}
