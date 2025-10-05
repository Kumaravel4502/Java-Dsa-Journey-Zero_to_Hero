package Recursion.Level1Quetions;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print("reversed Number : ");
//        reverse1(123);
        System.out.println(reverse2(4321));
//        System.out.println(sum);
    }

//    static int sum = 0;
//
//    static void reverse1(int n) {
//        if (n == 0) {
//            return;
//        }
//        int rem = n % 10;
//        sum = sum * 10 + rem;
//        reverse1(n / 10);
//    }

    static int reverse2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}



/*
    digits find panna → log10 use pannom.

    Helper recursion la → last digit eduthutu, correct position la multiply pannitu, next digits ku recursive call panrom.

    Finally single digit varum bothu stop panniduvom.
 */



/*
        Step by Step Call Stack
        Call: helper(1234, 4)
           rem = 4
           return 4*1000 + helper(123, 3)

        Call: helper(123, 3)
           rem = 3
              return 3*100 + helper(12, 2)

        Call: helper(12, 2)
           rem = 2
           return 2*10 + helper(1, 1)

        Call: helper(1, 1)
           Base Case → return 1

----------------------------------------------------------------------

        Now Unwinding the Stack (Returning Backwards)
        helper(1,1) → 1

        helper(12,2) → 2*10 + 1 = 20 + 1 = 21

        helper(123,3) → 3*100 + 21 = 300 + 21 = 321

        helper(1234,4) → 4*1000 + 321 = 4000 + 321 = 4321
 */