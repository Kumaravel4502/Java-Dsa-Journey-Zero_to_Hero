package CollectionFramework.Set.TreeSet;

import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

    public static void main(String[] args) {
        Set bag1=new TreeSet();
        bag1.add(0);
        bag1.add(-1);
        bag1.add(10);
        bag1.add(5);
        System.out.println(bag1);

        Set bag2=new TreeSet();
        bag2.add("Red");
        bag2.add("Yellow");
        bag2.add("Black");
        bag2.add("Green");
        System.out.println(bag2);
    }
}

