// Write a Java program to remove the elements from a list
package CollectionFramework.CustomArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

        List bag = new ArrayList<>();
        bag.add("Tamil");
        bag.add("English");
        bag.add("Telugu");
        bag.add("Malayalam");
        System.out.println(bag);
        bag.remove("English");
        System.out.println(bag);

    }
}
