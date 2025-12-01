// WAJP to add one collection inside another collection ( add one list into another list);


package CollectionFramework.CustomArrayList;

import java.util.ArrayList;
import java.util.List;

public class EX1 {
    public static void main(String[] args) {
        List bag1 = new ArrayList<>();
        bag1.add("Snacks");
        bag1.add("Shoes");
        bag1.add("Watch");
        bag1.add("Car");

        List bag2=new ArrayList<>();
        bag2.add("Bike");
        bag2.add("Motor");
        bag2.add("Lorry");
        bag2.add("Driver");
        System.out.println("Bag 1 : "+bag1);
        System.out.println("Bag 2 :"+bag2);
        bag1.addAll(bag2);
        System.out.println("All : "+bag1);
    }
}
