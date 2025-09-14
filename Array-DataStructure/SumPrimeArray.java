import java.util.*;
public class SumPrimeArray {


    public static void primeNum(int num[]) {
        int sum = 0;

        for (int i = 0; i < num.length; i++) {   // loop through array elements
            int n = num[i];
            boolean isPrime = true;

            if (n <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= n / 2; j++) {  // check divisibility
                    if (n % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                sum += n;  // add prime to sum
            }
        }

        System.out.println("Sum of Prime num : " + sum);
    }

    public static void main(String[] args) {
        int a[] = {8, 7, 4, 1, 2, 3};
        System.out.println("A : " + Arrays.toString(a));
        primeNum(a);
    }
}
