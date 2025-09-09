// 645. Set Mismatch

import java.util.*;

public class SetMismatch {

    public static int[] mismatch(int[] nums) {
        int i = 0;
        int n = nums.length;

        // Step 1: Cyclic sort (put every number at its correct index)
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // Swap nums[i] with nums[correct]
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find the duplicate and missing number
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return new int[]{nums[i], i + 1};

            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 4};
        System.out.println("Mismatch numbers : " + Arrays.toString(mismatch(nums)));
    }
}
