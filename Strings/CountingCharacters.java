package Strings;

public class CountingCharacters {
    public static void main(String[] args) {
        String str = "aaabbcccaaaa";

        System.out.println(solve(str));
    }

    static String solve(String str) {
        String res = "";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                res = res + str.charAt(i - 1) + count;
                count = 1;
            }
        }
        return res = res + str.charAt(str.length() - 1) + count;
    }
}
