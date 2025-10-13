package OOPS.ClassAndObjects.Constructor;

public class TestStudent {
    public static void main(String[] args) {

        // Using No - Argument
        Student s1 = new Student();
        s1.id = 102;
        s1.name = "Kumaravel";
        s1.phone = 849395393;

        //Using parameterized
        Student s2 = new Student(101, "Nothing", 83499397);
        s1.info();
        s2.info();

    }

}
