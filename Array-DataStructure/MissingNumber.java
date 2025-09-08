
public class MissingNumber {

    public static void main(String[] args) {
        int a[] = {1, 5, 8, 11};
        for (int i = 0, j = 1; i < a.length; i++, j++) {
            if (a[i] != j) {
                System.out.println(j + " ");
                i--;
            }

        }
    }
}
