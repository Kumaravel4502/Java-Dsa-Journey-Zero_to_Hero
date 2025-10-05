package Recursion.ArrayQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 18, 9};
        int target = 1;
        System.out.println(linear(arr, target, 0));
    }

    static boolean linear(int arr[], int target, int index) {
        if(index== arr.length){
            return false;
        }
        return arr[index] == target || linear(arr,target,index+1);
    }

}
