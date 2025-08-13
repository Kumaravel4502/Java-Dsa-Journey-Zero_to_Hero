
public class MissingNumberFinder {

    // public static void main(String[] args) {
    //     int[] numbers = {1, 2, 4, 5, 6, 8, 11};
    //     Arrays.sort(numbers);
    //     System.out.print("Missing numbers: ");
    //     for (int i = 0; i < numbers.length - 1; i++) {
    //         int current = numbers[i];
    //         int next = numbers[i + 1];
    //         for (int j = current + 1; j < next; j++) {
    //             System.out.print(j + " ");
    //         }
    //     }
    // }
    //-------------------------------------------------------------------
    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 8};
        int j = 1;
        System.out.print("Missing numbers: ");
        for (int i = 0; i < a.length; i++) {
            while (j < a[i]) {
                System.out.println(j);
                j++;
            }
            j++;
        }
    }
}
