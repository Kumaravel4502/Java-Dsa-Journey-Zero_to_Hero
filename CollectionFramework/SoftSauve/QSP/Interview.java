package CollectionFramework.SoftSauve.QSP;

import java.util.*;

public class Interview {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyboard = sc.nextLine();   // e.g. 0123456789
        String number = sc.nextLine();     // e.g. 210

        int pos[] = new int[10];
        for (int i = 0; i < 10; i++) {
            pos[keyboard.charAt(i) - '0'] = i;
        }
        int TotalTime=0;

        TotalTime+=pos[number.charAt(0)-'0'];

        for(int i=1;i<number.length();i++){
            int prev=pos[number.charAt(i-1)-'0'];
            int curr=pos[number.charAt(i)-'0'];
            TotalTime+=Math.abs(curr-prev);
        }
        System.out.println(TotalTime);
    }
}
