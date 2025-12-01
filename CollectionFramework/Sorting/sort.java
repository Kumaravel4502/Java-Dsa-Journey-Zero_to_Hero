package CollectionFramework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort {

    public static void main(String[] args) {

        List bag = new ArrayList();
        bag.add(20);      // 20 → Integer
        bag.add(100);
        bag.add(10);
        bag.add(50);
        bag.add(30);

        System.out.println(bag);    // [20, 100, 10, 50, 30]

        Collections.sort(bag);
        System.out.println(bag);     // [10, 20, 30, 50, 100]


        List<String> bag2 = new ArrayList<>();
        bag2.add("Pranav");
        bag2.add("Gopa");
        bag2.add("Shantanu");
        bag2.add("Taluze");
        bag2.add("Nikhil");

        System.out.println(bag2);  // [Pranav, Gopa, Shantanu, Taluze, Nikhil]

        Collections.sort(bag2);
        System.out.println(bag2);    // [Gopa, Nikhil, Pranav, Shantanu, Taluze]
    }
}
