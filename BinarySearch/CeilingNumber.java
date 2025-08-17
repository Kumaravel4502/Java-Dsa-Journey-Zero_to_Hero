// smallest number greater than or equal to a given number in a sorted array

import java.util.Scanner;

public class CeilingNumber {

    static Scanner s = new Scanner(System.in);

    public static int ceiling(int arr[], int target) {
        int low = 0, high = arr.length - 1, mid = 0, ans = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Enter the Element to Search : ");
        int target = s.nextInt();
        int ans = ceiling(arr, target);
        System.out.println("ceiling of " + target + " is : " + arr[ans] + " at index " + ans);
    }
}
