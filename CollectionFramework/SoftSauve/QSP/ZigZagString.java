package CollectionFramework.SoftSauve.QSP;

public class ZigZagString {
    public static String zigzag(String s, int r) {
        if (r == 1) return s;

        StringBuilder[] a = new StringBuilder[r];
        for (int i = 0; i < r; i++) {
            a[i] = new StringBuilder();
        }

        int row = 0, dir = 1;

        for (char c : s.toCharArray()) {
            a[row].append(c);                      // put char in row
            if (row == 0) dir = 1;                 // go down
            else if (row == r - 1) dir = -1;       // go up
            row += dir;                            // move row
        }

        System.out.println("Row wise output:");
        for (int i = 0; i < r; i++) {
            System.out.println("Row " + i + ": " + a[i].toString());
        }


        StringBuilder out = new StringBuilder();
        for (StringBuilder sb : a) out.append(sb); // join rows
        return "Concated : " + out.toString();
    }

    public static void main(String[] args) {
        System.out.println(zigzag("ABCDEFGH", 2));
        System.out.println("----------------------------");
        System.out.println(zigzag("SOFTSUAVETECHNOLOGY", 3));
    }
}


