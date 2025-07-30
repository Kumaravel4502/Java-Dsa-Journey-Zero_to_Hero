
// import java.util.*;
// public class EvenOrOdd {
//     static Scanner s = new Scanner(System.in);
//     public static int evenOdd(int n) {
//         {
//             if (n % 2 == 0) {
//                 System.out.println("Even");
//             } else {
//                 System.out.println("Odd");
//             }
//         }
//         return n;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter the Number : ");
//         int n = s.nextInt();
//         evenOdd(n);
//     }
// }
//--------------------------------------------------------
// Another Method
import java.util.*;

public class EvenOrOdd {

    static String res;
    static Scanner s = new Scanner(System.in);

    public static String evenOdd(int n) {
        res = n % 2 == 0 ? "Even" : "Odd";
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        int n = s.nextInt();
        evenOdd(n);
        System.out.println(res);
    }
}
