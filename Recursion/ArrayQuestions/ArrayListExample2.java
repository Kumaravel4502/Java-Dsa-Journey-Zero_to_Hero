package Recursion.ArrayQuestions;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 6};
        int target = 4;
        ArrayList<Integer> ans = findIndex(arr, target, 0);
        System.out.println(ans);
    }

    static ArrayList<Integer> findIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        //Base Condition
        if (index == arr.length) {
            return list;
        }

        //This will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndex(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
