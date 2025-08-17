//biggest number less than or equal to a given number in a sorted array

import java.util.Scanner;

public class FloorNumber {

    static Scanner s = new Scanner(System.in);

    public static int floor(int arr[], int target) {
        int low = 0, high = arr.length - 1, mid = 0, ans = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                ans = mid;
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Enter the Element to Search : ");
        int target = s.nextInt();
        int ans = floor(arr, target);

        if (ans == -1) {
            System.out.println("No floor exists for " + target);
        } else {
            System.out.println("floor of " + target + " is : " + arr[ans] + " at index " + ans);
        }
    }
}
