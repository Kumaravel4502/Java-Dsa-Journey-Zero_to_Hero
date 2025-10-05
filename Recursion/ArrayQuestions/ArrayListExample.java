package Recursion.ArrayQuestions;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 8};
//        int target = 4;
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);
//        System.out.println(list);

    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

}
