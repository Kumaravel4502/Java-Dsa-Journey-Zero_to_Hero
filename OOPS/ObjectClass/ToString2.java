package OOPS.ObjectClass;

class Laptop {
    String model;
    int price;

    @Override
    public String toString() {
        return model + " : " + price;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ToString2 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 59000;
        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 59000;
boolean res=obj1.equals(obj2);
        System.out.println(res);
    }
}
