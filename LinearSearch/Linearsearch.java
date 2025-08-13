
public class Linearsearch {

    static int[] linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return new int[]{i, nums[i]}; // index, element
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int result[] = linearSearch(arr, 3);
        if (result[0] != -1) {
            System.out.println("Element found at index: " + result[0]
                    + ", Element: " + result[1]);
        } else {
            System.out.println("Element not found.");
        }
    }
}
