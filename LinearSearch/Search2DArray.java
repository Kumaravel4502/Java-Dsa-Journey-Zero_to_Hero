
import java.lang.reflect.Array;
import java.util.*;

public class Search2DArray {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a[][] = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 56}, {12, 18}};
        System.out.println("Enter the Element to Search : ");
        int target = s.nextInt();
        int res[][] = search(a, target);
    }

    public static int[][] search(int a[][], int target) {
        System.out.println("Element Found at ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    // System.out.println("Element Found at " + i + " " + j);
                    System.out.println("[" + i + ", " + j + "] ");
                }
            }

        }
        return a;
    }
}
