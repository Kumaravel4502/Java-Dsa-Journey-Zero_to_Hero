//81. Search in Rotated Sorted Array II
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class RotatedSortedArrayII {

    public static void main(String[] args) {
        int nums[] = {2,5,6,0,0,1,2};
        int target = 0;
        boolean ans = search(nums, target);
        System.out.println("Position of " + target + " is: " + ans);
    }

    static boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && nums[mid] >= target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[right] >= target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
