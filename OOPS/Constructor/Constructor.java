
class Student {

    //States
    String name;
    int age;

    //Constructor
    Student(String name, int age) // Parameterised constructor( contains Argument on it)
     {   
        this.name = name;
        this.age = age;
    }

    //Behaviour
    void details() {
        System.out.println("Name: " + name + " , " + " Age: " + age);
    }

}

public class Constructor {

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.details();
        Student s2 = new Student("Bob", 22);
        s2.details();
    }
}
