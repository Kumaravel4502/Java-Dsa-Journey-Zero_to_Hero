
import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Kumaravel";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        char[] arr = rev.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
