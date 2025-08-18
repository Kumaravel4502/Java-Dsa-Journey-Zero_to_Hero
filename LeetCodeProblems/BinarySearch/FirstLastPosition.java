
public class FirstLastPosition {

    public static int[] searchRange(int arr[], int target) {
        int ans[] = {-1, -1};

        int low = search(arr, target, true);
        int high = search(arr, target, false);
        ans[0] = low;
        ans[1] = high;
        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {
        int low = 0, high = nums.length - 1, mid = 0, ans = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;//move left
            } else if (nums[mid] > target) {
                high = mid - 1;//move right
            } else {
                ans = mid;//store the index value
                if (findStartIndex) {
                    high = mid - 1; // move left to find the first occurrence
                } else {
                    low = mid + 1; // move right to find the last occurrence
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(arr, target);
        System.out.println("First and Last Position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
