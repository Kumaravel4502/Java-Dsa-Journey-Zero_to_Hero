package OOPS.Encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setsid(100);
        s1.setPhone(12344);
        s1.setName("Kumar");
        System.out.println("Student id : "+s1.getsid());
        System.out.println("Student Name : "+s1.getName());
        System.out.println("Student Phone : "+s1.getPhone());


    }
}
