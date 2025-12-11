package CollectionFramework.SoftSauve.QSP;
//Diff bt each digits


public class Demo3 {
    public static void main(String[] args) {
        int num = 456;
        String s = String.valueOf(num);
        boolean b = true;
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);//4
            char c2 = s.charAt(i + 1);//5
            int n = (c1 - '0') - (c2 - '0');// 4-52 , 5-53 , 6-54  , 0 -48  ASCII Values
            System.out.print(n + " ");
            if (!(Math.abs(n) == 1)) {
                b = false;
            }
        }
        System.out.println(b ? "valid " : "Not Valid");
    }
}
