
public class Strings {

    public static void main(String args[]) {
        String Series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            Series += ch + " ";
        }
        System.out.println(Series + " ");

    }

}
