package OOPS.Encapsulation;

public class Car {
    private String Brand;
    private int Price;
    private int Speed;

    //constructor
    public Car() {
    }

    ;


    //Getter Method

    public String getBrand() {
        return Brand;
    }

    public int getPrice() {
        return Price;
    }

    public int getSpeed() {
        return Speed;
    }

    //setter method

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

}
