package CollectionFramework.Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {

        Set bag = new HashSet<>();

        bag.add(10);
        bag.add(20);
        bag.add(10); // duplicate, will not be added
        bag.add(null);
        bag.add(true);
        bag.add(30);

        System.out.println(bag);


    }
}
