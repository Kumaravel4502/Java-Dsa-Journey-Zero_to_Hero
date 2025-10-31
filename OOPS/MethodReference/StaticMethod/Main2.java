package OOPS.MethodReference.StaticMethod;

//Syntax : ClassName :: Method Name

interface Master {
    void speak();
}

class Trainer {
    public static void teach() {
        System.out.println("teach Something");
    }

    public static void code() {
        System.out.println("Code something");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Master m1 = Trainer::code;
        m1.speak();
        Master m2 = Trainer::teach;
        m2.speak();
    }

}
