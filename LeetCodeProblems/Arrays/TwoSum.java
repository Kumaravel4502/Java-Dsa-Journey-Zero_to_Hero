// package Arrays;

// public class TwoSum {
//     public int[] twoSumBrute(int nums[], int target) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] + nums[j] == target) {
//                     return new int[]{i, j};
//                 }
//             }
//         }
//         return new int[]{-1, -1};
//     }
//     public static void main(String[] args) {
//         TwoSum ts = new TwoSum();
//         int[] nums = {2, 7, 11, 15};
//         int target = 26;
//         int[] result = ts.twoSumBrute(nums, target);
//         System.out.println("Indices: [" + result[0] + " , " + result[1]+"]");
//     }
// }
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left, right}; 
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // already sorted
        int target = 26;
        int[] result = TwoSum.twoSum(nums, target);
        if (result.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices: [" + result[0] + " , " + result[1] + "]");
        }
    }
}
