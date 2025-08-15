//1512. Number of Good pairs

public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int freq[] = new int[101];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            
            {
                count += freq[nums[i]];
                freq[nums[i]]++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }
}
