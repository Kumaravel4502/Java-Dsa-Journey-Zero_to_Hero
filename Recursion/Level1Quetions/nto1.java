package Recursion.Level1Quetions;

public class nto1 {

    public static void main(String[] args) {
        System.out.println("Print Numbers from n to 1 : ");
//        fun(5);
//        funrev(5);
        funBoth(5);
    }

    static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return fun(n - 1);
    }

    static void funrev(int n) {
        if (n == 0) {
            return;
        }
        funrev(n - 1);
        System.out.println(n);
    }

    static void funBoth(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        funBoth(n - 1);
        System.out.println(n);
    }

}
