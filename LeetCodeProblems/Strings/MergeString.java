//Merge Strings Alternately
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"

import java.util.Scanner;

public class MergeString {

    static Scanner s = new Scanner(System.in);

    public static String mergeStringAlternately(String word1, String word2) {
        String res = "";
        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                res = res + word1.charAt(i);
            }
            if (i < word2.length()) {
                res = res + word2.charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Enter the word 1 : ");
        String word1 = s.nextLine();
        System.out.println("Enter the word 2 : ");
        String word2 = s.nextLine();
        String res = mergeStringAlternately(word1, word2);
        System.out.println("word 1 : " + word1 + " " + "word 2 : " + word2);
        System.out.println(res);
    }
}
