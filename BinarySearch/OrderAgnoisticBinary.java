
import java.util.Scanner;

public class OrderAgnoisticBinary {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // int arr[] = {3, 7, 9, 11, 25, 34, 55};
        int arr[] = {55, 45, 34, 23, 12, 11, 7};
        int target = s.nextInt();
        int res = orderAgnoisticBinarySearch(arr, target);
        System.out.println(res);
    }

    static int orderAgnoisticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
