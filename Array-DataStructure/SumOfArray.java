
public class SumOfArray {

    public static void sumArray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("The Sum of Array is : " + sum);
    }

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        sumArray(a);
    }
}
