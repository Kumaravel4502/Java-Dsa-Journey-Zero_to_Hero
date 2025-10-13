package OOPS.ClassAndObjects;

public class Laptopfactory {
    public static void main(String[] args) {
        Laptop obj1=new Laptop();
        obj1.Brand="Dell";
        obj1.Price=40000;
        obj1.Color="Silver";
        obj1.details();

        Laptop obj2=new Laptop();
        obj2.Brand="Lenovo";
        obj2.Price=50000;
        obj2.Color="Black";
        obj2.details();
    }
}
