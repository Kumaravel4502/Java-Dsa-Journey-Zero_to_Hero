
import java.util.Arrays;
import java.util.Scanner;

public class Max2DArray {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a[][] = {{23, 4, 1}, {18, 12, 3, 9}, {78, 99, 34, 56}, {12, 18}};
        int res[] = search(a);
        System.out.println(Arrays.toString(res));
    }

    public static int[] search(int a[][]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > large) {
                    large = a[i][j];
                }
            }
        }
        return new int[]{large};
    }

}
