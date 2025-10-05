
class ClassMembers {

    //Static variable
    static int id;

    //Non-static variable
    int age;

    //static Method
    public static void sheela() {
        // local variable 
        int phone;
        System.out.println("from sheela static method");
    }

    //Non-static Method
    public void ram() {
        System.out.println("from ram Non-static method");
    }

    //static Initializer block
    static {
        id = 101;
        System.out.println("from static Initializer block");
    }

    //Non-static Initializer block
    {
        age = 25;
        System.out.println("from Non-static Initializer block");
    }   

    //constructor

    public ClassMembers() {
        System.out.println("I'm from constructor");
    }

    public static void main(String args[]){
    System.out.println();
}
}


