package OOPS.ClassAndObjects.Constructor;

public class Student {
    int id;
    String name;
    int phone;

    // using No - Argument Constructor
    public Student() {

    }

    ;

    // using Parameterized Constructor

    public Student(int id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    void info() {
        System.out.println("Student id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Phone : " + phone);
        System.out.println("----------------------");
    }
}
