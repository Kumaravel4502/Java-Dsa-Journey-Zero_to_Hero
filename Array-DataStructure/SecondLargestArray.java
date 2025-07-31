
public class SecondLargestArray {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 49, 60};
        secondLarge(a);
    }

    public static void secondLarge(int a[]) {
        int SecondLarge = Integer.MIN_VALUE, Large = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > Large) {
                SecondLarge = Large;
                Large = a[i];
            } else if (a[i] > SecondLarge && a[i] != Large) {
                SecondLarge = a[i];
            }
        }
        if (SecondLarge == Integer.MIN_VALUE) {
            System.out.println("No Second Largest Element");
        } else {
            System.out.println("Second Largest : " + SecondLarge);
        }
    }
}
