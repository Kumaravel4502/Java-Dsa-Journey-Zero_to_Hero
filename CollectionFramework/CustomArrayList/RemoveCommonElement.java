// Write a Java program to remove the  Common elements from a list
package CollectionFramework.CustomArrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveCommonElement {
    public static void main(String[] args) {
        List list1=new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        list1.add("SQL");
        list1.add("Maths");

        List list2=new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("Tamil");
        list2.add("Science");

        System.out.println("List 1 : "+list1);
        System.out.println("List 2 : "+list2);
        list1.removeAll(list2);
        System.out.println("Balance Element : "+list1);
    }
}
