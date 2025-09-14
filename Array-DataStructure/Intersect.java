import java.util.*;

public class Intersect {

    public static void main(String[] args) {
        int Array1[] = {1, 2, 2, 1};
        int Array2[] = {2, 2};
        int res[] = intersect(Array1, Array2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // result size cannot be more than smaller array
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        boolean[] visited = new boolean[nums2.length]; // to mark used elements

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !visited[j]) {
                    temp[index++] = nums1[i];
                    visited[j] = true;
                    break; // move to next element in nums1
                }
            }
        }

        // copy only the used portion
        int[] res = new int[index];
        for (int i = 0; i < index; i++) {
            res[i] = temp[i];
        }

        return res;
    }
}
