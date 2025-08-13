import java.util.*;
class Dummy {

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 23, 9, 18};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }
}
