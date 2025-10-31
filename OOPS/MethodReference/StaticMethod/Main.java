package OOPS.MethodReference;

// 1. Reference to Static Method

interface Message {
    void display();
}

class Demo {
    public static void print() {
        System.out.println("Display Some Data");
    }

}


public class Main {
    public static void main(String[] args) {
        Message ref = Demo::print;
        ref.display();

    }
}
