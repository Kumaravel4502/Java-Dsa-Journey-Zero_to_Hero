package CollectionFramework.SoftSauve.QSP;

import java.util.*;

public class KeyBoard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String keyboard = sc.nextLine();   // e.g. 0123456789
        String number = sc.nextLine();     // e.g. 210

        // Store positions of digits
        int[] pos = new int[10];
        for (int i = 0; i < 10; i++) {
            pos[keyboard.charAt(i) - '0'] = i;
        }

        int totalTime = 0;

        // Cost to type first digit (starting from index 0)
        totalTime += pos[number.charAt(0) - '0'];

        // Cost for rest of digits
        for (int i = 1; i < number.length(); i++) {
            int prev = pos[number.charAt(i - 1) - '0'];
            int curr = pos[number.charAt(i) - '0'];

            totalTime += Math.abs(curr - prev);
        }

        System.out.println(totalTime);
    }
}
