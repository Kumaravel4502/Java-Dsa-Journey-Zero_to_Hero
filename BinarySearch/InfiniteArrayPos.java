
public class InfiniteArrayPos {

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println("Position of " + target + " is: " + ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        //condition to find the range
        while (arr[end] < target) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }

}
