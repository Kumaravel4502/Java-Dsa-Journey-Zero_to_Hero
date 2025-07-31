// Find repeating number in array

public class RepeatingArray {

    public static int[] repeat(int a[]) {
        boolean found = false;
        System.out.print("The repeating number is : ");

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + "  ");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No Repeating Number");
        }
        return a;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 2, 3};
        repeat(a);
    }
}
