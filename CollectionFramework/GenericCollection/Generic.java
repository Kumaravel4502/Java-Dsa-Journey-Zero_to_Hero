// Write a Java programme to create collection of students object and print the student who is having less than 35

package CollectionFramework.GenericCollection;

import java.util.*;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        ls.add(new Student(50,"kumar",1));
        ls.add(new Student(20,"Manoj",2));
        ls.add(new Student(30,"Ram",3));
        ls.add(new Student(70,"Sam",4));
        for(Student s:ls){
            if(s.marks<35){
                System.out.println(s);
            }
        }


    }
}
