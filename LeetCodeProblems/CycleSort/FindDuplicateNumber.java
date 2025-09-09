// 287. Find the Duplicate Number

import java.util.*;

public class FindDuplicateNumber {

    public static int findDuplicate(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] != i + 1) {
                int currInd = nums[i] - 1;
                if (nums[i] < n && nums[currInd] != nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[currInd];
                    nums[currInd] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2, 2};
        System.out.println("The Duplicate Number is : " + findDuplicate(nums));
    }
}
