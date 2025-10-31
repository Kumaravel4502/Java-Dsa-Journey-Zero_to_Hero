package OOPS.Inheritance.MultiLevelInheritance;

public class Animal {
    void eat() {
        System.out.println("Eating....");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks...");
    }
}

class Puppy extends Dog {
    void cute() {
        System.out.println("puppy is cute...");
    }
}

class TestAnimal {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.eat();
        obj.bark();
        obj.cute();
    }
}
