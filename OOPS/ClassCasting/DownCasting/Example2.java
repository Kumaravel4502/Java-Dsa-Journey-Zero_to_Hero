package OOPS.ClassCasting.DownCasting;


class Animal {
    void sound() {
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}


public class Example2 {
    public static void main(String[] args) {
        Animal a = new Dog(); //Upcasting
        a.sound(); //Dog's sound is called
//DownCasting
        Dog d = (Dog) a;
        d.fetch();
    }
}
