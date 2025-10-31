package OOPS.HasARelationship;

public class TestCar {
    public static void main(String[] args) {
        Car c1=new Car("Ferrari","Red",new Engine(2.4));
        System.out.println("Brand Name : "+c1.brand);
        System.out.println("Color : "+c1.color);
        System.out.println("CC : "+c1.e.cc);
        c1.e.combustion();
        c1.drive();
    }
}
