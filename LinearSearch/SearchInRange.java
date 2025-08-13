
class SearchInRange {

    static int[] linearSearch(int nums[], int key,int start,int end) {
        for (int i = start; i < end; i++) {
            if (nums[i] == key) {
                return new int[]{i, nums[i]}; // index, element
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 43, 3, 4, 5, -7, 13, 25};
        int target = 43;
        int result[] = linearSearch(arr, target, 1, 4);
        if (result[0] != -1) {
            System.out.println("Element found at index: " + result[0]
                    + ", Element: " + result[1]);
        } else {
            System.out.println("Element not found.");
        }
    }
}
