package OOPS.ClassCasting.InstanceOf;


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


public class Instance {
    public static void main(String[] args) {
        Animal a = new Dog(); //Upcasting
        a.sound(); //Dog Barks
////DownCasting
//        Dog d = (Dog) a;
//        d.fetch();// Dog fetches the ball

        // DownCasting (safe way) using instanceOf

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.fetch();
        } else {
            System.out.println("Not a Dog");
        }
    }
}
