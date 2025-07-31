
import java.util.*;

public class SearchElement {

    static Scanner s = new Scanner(System.in);

    public static void search(int a[]) {
        System.out.print("Enter the Element to Search : ");
        int key = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println("Element Found at Index : " + i);
                return;
            }
        }
        System.out.println("Element Not Found");
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        search(a);
    }
}
