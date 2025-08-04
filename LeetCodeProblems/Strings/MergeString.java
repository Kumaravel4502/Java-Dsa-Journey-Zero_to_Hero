//Merge Strings Alternately
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"

public class MergeString {

    static String result = "";

    public static String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                result += word1.charAt(i);
            }
            if (i < word2.length()) {
                result += word2.charAt(i);
            }
        }
        System.out.println("result : " + result);
        return result;
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println("word1 : " + word1 + " word2 : " + word2);
        String result = mergeAlternately(word1, word2);
    }
}
