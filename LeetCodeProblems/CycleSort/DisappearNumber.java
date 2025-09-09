
import java.util.*;

public class DisappearNumber {

    public static List<Integer> missing(int[] nums) {
        int i = 0;
        int n = nums.length;

        // Step 1: Place each number at its correct index (Cycle Sort logic)
        while (i < n) {
            int currInd = nums[i] - 1;
            if (nums[i] != nums[currInd]) {
                int temp = nums[i];
                nums[i] = nums[currInd];
                nums[currInd] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Collect all missing numbers
        List<Integer> missingNumbers = new ArrayList<>();
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                missingNumbers.add(index + 1);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = missing(nums);
        System.out.println("Missing numbers: " + result);
    }
}
