
import java.util.Scanner;

public class SearchString {

//     static boolean search(String str, char target) {
//         if (str.length() == 0) {
//             return false;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             if (target == str.charAt(i)) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         String Name = "Kumaravel";
//         char target = 'r';
//         boolean res = search(Name, target);
//         if (res) {
//             System.out.println("Found");
//         } else {
//             System.out.println("Not Found");
//         }
//         // System.out.println(Arrays.toString(Name.toCharArray()));
//     }
// }
    static Scanner s = new Scanner(System.in);

    public static int[] search(String str, char target) {
        if (str.length() == 0) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return new int[]{i, str.charAt(i)};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        String Name = "Kumaravel";
        System.out.println("Enter the Character to Search : ");
        char target = s.next().charAt(0);
        int result[] = search(Name, target);
        if (result[0] != -1) {
            System.out.println("Element found at index: " + result[0]
                    + ", Element: " + (char) result[1]);
        } else {
            System.out.println("Element not found.");
        }
    }
}
