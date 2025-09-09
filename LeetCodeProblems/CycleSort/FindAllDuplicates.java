//447. Find All Duplicates in an Array

import java.util.*;

public class FindAllDuplicates {

    public static List<Integer> findDuplicates(int[] nums) {
        // List<Integer> duplicates = new ArrayList<>();
        int i = 0;
        int n = nums.length;
        // Step 1: Place each number at its correct index (Cycle Sort logic)
        while (i < n) {
            int currInd = nums[i] - 1;
            if (nums[i] != nums[currInd])  {
                int temp = nums[i];
                nums[i] = nums[currInd];
                nums[currInd] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Collect all missing numbers
        List<Integer> duplicates = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                duplicates.add(nums[index]);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDuplicates(nums);
        System.out.println("Duplicate numbers: " + result);
    }
}
