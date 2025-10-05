package Recursion.ArrayQuestions;

public class RotatedBinary {
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 7;
        int res = binary(arr, target, 0, arr.length - 1);
        System.out.println(res);   // should print 2
    }

    static int binary(int arr[], int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Left side sorted
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && arr[mid] >= target) {
                return binary(arr, target, start, mid - 1);
            } else {
                return binary(arr, target, mid + 1, end);
            }
        }

        // Right side sorted
        else {
            if (arr[end] <= target && arr[mid] > target) {
                return binary(arr, target, mid + 1, end);
            } else {
                return binary(arr, target, start, mid - 1);
            }
        }
    }
}
