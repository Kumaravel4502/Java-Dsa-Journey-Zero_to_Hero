package Recursion;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1};
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[], int last, int index) {

        // Base condition: if we have only one element left

        if (last == 0) {
            return;
        }

        // If current index reaches 'last', start next pass

        if (index == last) {
            sort(arr, last - 1, 0);
            return;
        }

        // Swap if elements are out of order

        if (arr[index] > arr[index + 1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }

        sort(arr, last, index + 1);
    }
}
