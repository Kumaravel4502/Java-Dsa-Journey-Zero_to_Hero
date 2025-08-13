
import java.util.*;

public class TwoSumII {

    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res[] = new int[2];
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 5, 7, 11};
        int target = 18;
        System.out.println(Arrays.toString(twoSum(num, target)));
    }
}
