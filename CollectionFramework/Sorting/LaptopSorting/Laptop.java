package CollectionFramework.Sorting.LaptopSorting;

public class Laptop implements Comparable<Laptop> {
    double price;
    String name;

    public Laptop(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Price : " + price;
    }

    @Override
    public int compareTo(Laptop l) {
        return Double.compare(this.price, l.price); // Cleaner and handles equality
    }
}
