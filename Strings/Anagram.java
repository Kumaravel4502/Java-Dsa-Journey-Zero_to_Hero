package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Earth";
        String str2 = "Heart";

        System.out.println(isAnagram(str1, str2) ? "Anagram" : "Not an Anagram");

    }

    static boolean isAnagram(String str1, String str2) {
        // Convert both strings to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // If lengths are not equal, not an anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        // Sort both arrays
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // Compare sorted arrays
        return Arrays.equals(ch1, ch2);
    }
}
