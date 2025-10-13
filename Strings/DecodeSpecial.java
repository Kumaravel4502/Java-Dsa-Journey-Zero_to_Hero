package Strings;

public class DecodeSpecial {
    public static void main(String[] args) {
        String str = "Ku#M%a&r";  // Input string
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is lowercase (a–z)
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); // Convert to uppercase
            }
            // If character is uppercase (A–Z)
            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // Convert to lowercase
            }
            // If it's a special character, leave it unchanged

            res = res + ch; // Append character to result
        }

        System.out.println("Converted String: " + res);
    }
}
