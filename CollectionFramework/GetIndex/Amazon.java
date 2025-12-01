package CollectionFramework.GetIndex;


import java.util.ArrayList;
import java.util.List;

public class Amazon {
    public static void main(String[] args) {
        List cart = new ArrayList<>();
        cart.add(new Product("Iphone", 120000, "white"));
        cart.add(new Product("Redmi", 10000, "Green"));
        cart.add(new Product("Google pixel", 17000, "Black"));
        cart.add(new Product("Vivo", 12000, "Pink"));


        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i) instanceof Product) {
                Product p = (Product) cart.get(i);
                if (p.price > 10000) {
                    System.out.println(cart.get(i));
                }
            }
        }

    }
}
