class Car {

    // States (instance variables)
    String name;
    int speed;

    // Behavior (method)
    void start() {
        System.out.println(name + " is running at speed " + speed + " km/h");
    }
}

public class Classes {
    public static void main(String[] args) {
        // Object 1
        Car car1 = new Car();
        car1.name = "BMW";
        car1.speed = 200;
        car1.start();

        // Object 2
        Car car2 = new Car();
        car2.name = "Audi";
        car2.speed = 250;
        car2.start();
    }
}
