package CollectionFramework.Sorting.StudentSorting;


import java.util.ArrayList;
import java.util.Collections;

public class School {
    public static void main(String[] args) {

        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student("Kumar", 1, 100));
        ls.add(new Student("Ram", 3, 30));
        ls.add(new Student("kathir", 4, 40));
        ls.add(new Student("Mano", 2, 50));

        System.out.println("\t\tBefore Sorting\n");
        for (Student s : ls) {
            System.out.println(s);
        }

        Collections.sort(ls);
        System.out.println("\t\tAfter Sorting\n");

        for (Student s : ls) {
            System.out.println(s);
        }
    }
}