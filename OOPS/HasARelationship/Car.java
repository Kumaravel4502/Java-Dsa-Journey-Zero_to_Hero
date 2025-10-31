package OOPS.HasARelationship;

public class Car {
    String brand;
    String color;
    Engine e;

    public Car(String brand, String color, Engine e) {
        this.brand = brand;
        this.color = color;
        this.e = e;
    }

    public void drive() {
        System.out.println("Car is Ready to Drive");
    }


}

