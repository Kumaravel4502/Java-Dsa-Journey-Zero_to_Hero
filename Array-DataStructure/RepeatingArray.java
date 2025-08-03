// Find repeating number in array

import java.util.Scanner;

public class RepeatingArray {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Size of the Array : ");
        int a[] = new int[s.nextInt()];
        System.out.println("Enter the Array Elements :");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("The repeating Elements are : ");
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            boolean isPrinted = false;
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    isPrinted = true;
                    break;
                }
            }
            if (isPrinted) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No Repeating Elements");
        }
    }
}
