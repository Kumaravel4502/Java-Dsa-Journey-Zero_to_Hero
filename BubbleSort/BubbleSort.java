
import java.util.*;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {3,5,1,4,2};
        boolean Swapped=false;
        System.out.println("Before Swapping : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    Swapped=true;
                }
            }
            if(!Swapped){
                break;
            }
        }      
        System.out.println("After Swapping : " + Arrays.toString(arr));
    }
}
