import java.util.Arrays;
import java.util.Scanner;

class Dummy {
    static Scanner s = new Scanner(System.in);

    public static void missingNum(int num[]) {
        System.out.print("Missing Numbers : ");
        for (int i = 0; i < num.length - 1; i++) {
            int current = num[i];
            int next = num[i + 1];

            for (int j = current + 1; j < next; j++) {
                System.out.print(j + " ");
            }
        }
        System.out.println();


    }

    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 8};
        System.out.println("A : " + Arrays.toString(a));
        missingNum(a);
    }
}
