//1295. Find Numbers with Even Number of Digits

public class NumberEvenDigits {

    static int count = 0;

    public static int countDigits(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int digit = 0;
            for (int j = arr[i]; j > 0; j = j / 10) {
                digit++;
            }
            if (digit % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 34, 345, 2432};
        countDigits(arr);
        System.out.println(count);

    }
}
