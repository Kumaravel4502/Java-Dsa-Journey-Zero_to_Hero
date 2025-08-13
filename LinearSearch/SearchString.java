
public class SearchString {

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String Name = "Kumaravel";
        char target = 'r';
        boolean res = search(Name, target);
        if (res) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        // System.out.println(Arrays.toString(Name.toCharArray()));

    }
}
