// Running sum of 1d array

import java.util.Arrays;

public class OneDArray {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningsum[i] = runningsum[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(runningsum));
    }
}
