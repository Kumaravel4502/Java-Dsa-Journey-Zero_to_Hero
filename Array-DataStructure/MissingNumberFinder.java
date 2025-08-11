
import java.util.Arrays;

public class MissingNumberFinder {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6, 8, 11};
        Arrays.sort(numbers);
        System.out.print("Missing numbers: ");

        for (int i = 0; i < numbers.length - 1; i++) {
            int current = numbers[i];
            int next = numbers[i + 1];

            for (int missing = current + 1; missing < next; missing++) {
                System.out.print(missing + " ");
            }
        }
    }
}
