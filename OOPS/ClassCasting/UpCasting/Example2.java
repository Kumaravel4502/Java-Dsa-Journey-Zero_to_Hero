package OOPS.ClassCasting.UpCasting;

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
        //   a.fetch();// CTE Method not found in Animal
    }
}
