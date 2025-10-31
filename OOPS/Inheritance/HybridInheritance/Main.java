package OOPS.Inheritance.HybridInheritance;

// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

// Single inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Interface for multiple inheritance
interface Electric {
    void charge();
}

// Interface for multiple inheritance
interface Luxury {
    void playMusic();
}

// Hybrid inheritance through implementing multiple interfaces
class ElectricCar extends Car implements Electric, Luxury {
    public void charge() {
        System.out.println("Electric car charging");
    }

    public void playMusic() {
        System.out.println("Playing music in electric car");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar();
        tesla.start();       // from Vehicle
        tesla.drive();       // from Car
        tesla.charge();      // from Electric interface
        tesla.playMusic();   // from Luxury interface
    }
}
