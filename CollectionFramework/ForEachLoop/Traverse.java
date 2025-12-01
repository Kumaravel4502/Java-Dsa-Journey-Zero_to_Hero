// WAJP to traverse a list using for each loop

package CollectionFramework.ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Traverse {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        list.add(10);
        list.add(1.5);
        list.add(null);
        list.add(true);
        for (Object x:list){
            System.out.println(x);

        }

    }
}
