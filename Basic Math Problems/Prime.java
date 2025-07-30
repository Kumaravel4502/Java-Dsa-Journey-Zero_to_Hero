
import java.util.*;

public class Prime {

    static Scanner s = new Scanner(System.in);
    static int Prime;

    public static int primeNum(int Prime) {
        for (int i = 1; i < Prime; i++) {
            if (Prime % i == 0 && i != 1 && i != Prime) {
                System.out.println("Not  A Prime");
                return 0;
            }
        }
        System.out.println("Prime Number");
        return Prime;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number to Check it is Prime or Not : ");
        Prime = s.nextInt();
        primeNum(Prime);
    }
}


//-------------------------------------------------------------------------------------


//Another Method to check if a number is prime



// import java.util.Scanner;

// public class Prime {

//     static Scanner s = new Scanner(System.in);

//     public static void main(String[] args) {
//         System.out.println("Enter a number to check if it is a Prime number:");
//         int n = s.nextInt();
//         int count = 0, i = 1;

//         while (i <= n) {
//             if (n % i == 0) {
//                 count++;
//             }
//             i++;
//         }
//         if (count == 2) {
//             System.out.println(n + " is a Prime number.");
//         } else {
//             System.out.println(n + " is not a Prime number.");
//         }
//     }
// }
