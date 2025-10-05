// write a Java program to find that unique element using bitwise operators.


public class UniqueElement {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 3, 4};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println("Unique element: " + res);
    }
}
