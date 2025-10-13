package OOPS.ClassAndObjects.Constructor.ConstructorChaining;

public class StudentChain {
    int sid;
    String name;
    int phone;

    public StudentChain(){};
    public StudentChain(int sid){
        this();
        this.sid=sid;
    }
    public StudentChain(int sid, String name){
        this(sid);
        this.name=name;
    }
    public StudentChain(int sid, String name, int phone){
        this(sid,name);
        this.phone=phone;
    }

    public void details(){
        System.out.println("Student ID : "+sid);
        System.out.println("Student Name : "+name);
        System.out.println("Student Phone : "+phone);

    }
}
