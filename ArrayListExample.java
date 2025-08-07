
import java.util.*;

public class ArrayListExample {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());
        }
        System.out.println(list);
    }
}
