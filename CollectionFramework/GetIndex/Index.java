// WAJP to get the values from a list
package CollectionFramework.GetIndex;

import java.util.ArrayList;
import java.util.List;

public class Index {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30.8);
        list1.add(49);
        list1.add(true);
        System.out.println(list1);
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(4));
        Object res = list1.get(2);
        System.out.println(res);


    }
}
