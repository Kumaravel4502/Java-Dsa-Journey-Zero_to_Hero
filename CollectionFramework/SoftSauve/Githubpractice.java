package CollectionFramework.SoftSauve;

import java.util.Arrays;

public class Githubpractice {
    public static void main(String[] args) {
//        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int b[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int rows = a.length;
//        int cols = a[0].length;
//        int res[][] = new int[rows][cols];
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                res[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(res));


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