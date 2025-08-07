
class Dummy {

    public static int[] two(int a[][]) {
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col]+" ");
            }
            System.out.println();
        }
        return null;
    }

    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9, 10, 11}
        };
        two(a);
    }
}
