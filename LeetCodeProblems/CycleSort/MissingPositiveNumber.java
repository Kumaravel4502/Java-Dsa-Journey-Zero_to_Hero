// 41. Missing Positive

public class MissingPositiveNumber {

    public static int findMissingPositive(int nums[]) {

        int i = 0;
        int n = nums.length;

        // Step 1: Place each number at its correct index
        while (i < n) {
            int currInd = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= n && nums[currInd] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[currInd];
                nums[currInd] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find the missing number
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(findMissingPositive(nums));
    }
}
