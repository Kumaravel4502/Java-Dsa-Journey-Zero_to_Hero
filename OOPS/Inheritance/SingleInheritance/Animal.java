package OOPS.Inheritance.SingleInheritance;

//Super class
public class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method from Animal
        d.bark();  // Method from Dog
    }
}