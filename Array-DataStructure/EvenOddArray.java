//WAJP to Count Even and  Odd numbers in an array

public class EvenOddArray {

    public static void countArr(int a[]) {
        int Even = 0, Odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }
        System.out.println("Odd Numbers are : " + Odd);
        System.out.println("Even Numbers are : " + Even);
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 7, 2, 6};
        countArr(a);
    }
}
