import java.util.*;
public class NumberTimes {
    
  public static void miss(int nums[]) {
        boolean visited[] = new boolean[nums.length];
        System.out.println("Duplicate Numbers and Their Counts : ");
        int i;
        for (i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }
                System.out.println(nums[i] + " --> " + count + " times");
            
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 3, 2, 4, 6, 3, 2};
        System.out.println("Array : " + Arrays.toString(a));
        miss(a);
    }
}
