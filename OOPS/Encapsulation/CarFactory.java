package OOPS.Encapsulation;

public class CarFactory {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.setBrand("Audi");
        c1.setPrice(200000);
        c1.setSpeed(200);
        System.out.println("Brand : "+c1.getBrand());
        System.out.println("Price  : "+c1.getPrice());
        System.out.println("Speed : "+c1.getSpeed());
        System.out.println("----------------------------");

        Car c2=new Car();
        c2.setBrand("Tesla");
        c2.setPrice(500000);
        c2.setSpeed(180);
        System.out.println("Brand : "+c2.getBrand());
        System.out.println("Price  : "+c2.getPrice());
        System.out.println("Speed : "+c2.getSpeed());

    }
}
