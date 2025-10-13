package Strings;

import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {

        String str1 = "the quick brown fox jumps over a lazy dog";
        System.out.println(isPanagram(str1) ? "panagram" : "Not a panagram");
    }

    static boolean isPanagram(String str1) {
        str1 = str1.toLowerCase();
        boolean[] occuring = new boolean[26];

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch >= 97 && ch <= 122) {
                occuring[ch - 97] = true;
            }
        }
        for (int i = 0; i < occuring.length; i++) {
            if (occuring[i] == false) {
                return false;
            }
        }
        return true;
    }
}
