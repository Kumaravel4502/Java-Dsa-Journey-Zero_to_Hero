package OOPS.Encapsulation;

public class Student {
    private String name;
    private int sid;
    private int phone;

    //constructor
    public Student() {
    }

    ;

    // Getter method used to get the data
    public int getsid() {
        return sid;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    // Setter method is used to set or modify the data

    public void setsid(int sid) {
        this.sid = sid;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }
}
