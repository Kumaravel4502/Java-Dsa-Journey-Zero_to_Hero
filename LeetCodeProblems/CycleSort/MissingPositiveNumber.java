// 41. Missing Positive

public class MissingPositiveNumber {

    public static int findMissingPositive(int nums[]) {
        int i = 0, n = nums.length;
        while (i < n) {
            int currInd = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < n && nums[i] != nums[currInd]) {

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
        System.out.println("Missing Positive Number : "+findMissingPositive(nums));
    }
}
