import java.util.Arrays;
import java.util.Scanner;

class Anagram {

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        str1 = new String(ch1);
        str2 = new String(ch2);

        if (str1.equalsIgnoreCase(str2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String 1 : ");
        String str1 = s.nextLine();
        System.out.println("Enter the String 2 : ");
        String str2 = s.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("is Anagram");
        } else {
            System.out.println("Not Anagram");
        }

    }
}