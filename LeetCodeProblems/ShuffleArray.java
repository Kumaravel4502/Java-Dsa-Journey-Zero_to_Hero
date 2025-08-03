//1470. Shuffle the Array

import java.util.*;

public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        ShuffleArray s = new ShuffleArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] result = s.shuffle(nums, 3);
        System.out.println(Arrays.toString(result));
    }
}
