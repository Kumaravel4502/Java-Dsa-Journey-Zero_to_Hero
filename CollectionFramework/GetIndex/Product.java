package CollectionFramework.GetIndex;

public class Product{
    String name;
    double price;
    String color;

    public Product(String name,double price,String color){
        super();
        this.name=name;
        this.price=price;
        this.color=color;
    }

    @Override
    public String toString(){
        return "Product [name=" + name + ", price=" + price + ", color=" + color + "]";
    }

}
