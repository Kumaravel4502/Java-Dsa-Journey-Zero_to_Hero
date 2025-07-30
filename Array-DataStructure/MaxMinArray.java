
import java.util.*;

public class MaxMinArray {

    static int large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;

    public static void maxMin(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large) {
                large = a[i];
            }
            if (a[i] < small) {
                small = a[i];
            }

            // OR
            // large = Math.max(a[i], large);
            // small = Math.min(a[i], small);
        }
        System.out.println("Largest : " + large);
        System.out.println("Smallest : " + small);

    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 80};
        System.out.println("Original Array: " + Arrays.toString(a));
        maxMin(a);

    }

}
