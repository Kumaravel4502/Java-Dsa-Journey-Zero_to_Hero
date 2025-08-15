
import java.util.*;

public class BinarySearch {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = {10, 12, 32, 45, 56, 58, 67, 78, 89, 90};
        System.out.println("Enter the Element to Search : ");
        int target = s.nextInt();
        int ans = binary(arr, target);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target) {
        int low = 0, high = arr.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                System.out.println("Element Found at Index : " + mid);
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
