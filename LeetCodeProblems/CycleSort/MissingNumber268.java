// 268. Missing Number

public class MissingNumber268 {

    public static int missing(int nums[]) {
        int i = 0;
        int n = nums.length;

        // Step 1: Place each number at its correct index
        while (i < n) {
            int currInd = nums[i];
            if (nums[i] < n && nums[currInd] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[currInd];
                nums[currInd] = temp;
            } else {
                i++;
            }
        }

        // Step 2: Find the missing number
        for (int index = 0; index < n; index++) {
            if (nums[index] != index) {
                return index; // index itself is the missing number
            }
        }

//case 2: if the element is not present in the array return n (nums.length)
        return n;
    }

    public static void main(String[] args) {
        int nums[] = {3, 0, 1};
        int result = missing(nums);
        System.out.println("Missing number is: " + result);
    }
}
