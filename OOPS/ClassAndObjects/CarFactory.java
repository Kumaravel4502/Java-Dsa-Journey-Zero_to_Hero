package OOPS.ClassAndObjects;

public class CarFactory {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.Brand = "BMW";
        obj1.Speed = 150;
        obj1.start();

        Car obj2 = new Car();
        obj2.Brand = "Audi";
        obj2.Speed = 180;
        obj2.start();
    }
}
