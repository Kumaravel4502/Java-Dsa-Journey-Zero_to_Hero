//1920. Build Array from Permutation
import java.util.*;
public class ArrayPermutation {
      public int[] buildArray(int[] nums) {
      int ans[]=new int[nums.length];
       for(int i=0;i<ans.length;i++){
        ans[i]=nums[nums[i]];
       }
    return ans;
    }
    public static void main(String[] args) {
        ArrayPermutation ap=new ArrayPermutation();
        int nums[]={0,2,1,5,3,4};
        int ans[]=ap.buildArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
