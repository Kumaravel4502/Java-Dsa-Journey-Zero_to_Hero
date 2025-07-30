//Write a java Program to copy Elements from one Array to Another

import java.util.*;

public class CopyArray {

    public static int[] copyArr(int a[]) {
        int res[] = new int[a.length];
        for(int i=0;i<res.length;i++){
            res[i]=a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        System.out.println("Original Array : " + Arrays.toString(a));
       int copy[]= copyArr(a);
        System.out.println("Copied Array :" + Arrays.toString(copy));
    }
}
