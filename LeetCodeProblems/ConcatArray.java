//1929. Concatenation of Array

import java.util.*;

public class ConcatArray {

    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length * 2];
        int half = nums.length;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[half++] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        ConcatArray c = new ConcatArray();
        int nums[] = {1, 2, 1};
        int ans[] = c.getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }
}
