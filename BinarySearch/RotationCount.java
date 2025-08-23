// WAJP to find the rotation count in a rotated sorted array
//l 


import java.util.*;
public class RotationCount {

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 8, 9, 0, 1, 2};
        int target = 0;
        int ans = search(nums, target);
        System.out.println("Position of " + target + " is: " + ans);
        System.out.println("Count is: " + ans);
    }

    static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, count = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && nums[mid] >= target) {
                    count++;
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
        return -1;
    }
}
