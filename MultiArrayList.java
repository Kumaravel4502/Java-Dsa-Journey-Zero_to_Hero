
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
//Add Elements to ArrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(s.nextInt());
            }
        }
//Print Elements of ArrayList
        System.out.print(list);
    }

}
