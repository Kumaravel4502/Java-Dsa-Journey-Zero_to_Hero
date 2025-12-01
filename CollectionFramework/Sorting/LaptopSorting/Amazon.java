package CollectionFramework.Sorting.LaptopSorting;

import java.util.ArrayList;
import java.util.Collections;

public class Amazon {
    public static void main(String[] args) {

        ArrayList<Laptop> ls = new ArrayList<>();
        ls.add(new Laptop(1000, "Lenovo"));
        ls.add(new Laptop(3000, "HP"));
        ls.add(new Laptop(5000, "Apple"));

        Collections.sort(ls);

        System.out.println(ls);
    }
}
