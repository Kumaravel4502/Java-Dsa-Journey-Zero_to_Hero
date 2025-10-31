
class Marker {
    String Color;
    int Price;

    //Constructor

    Marker(int Price, String Color) {
        super();
        this.Price = Price;
        this.Color = Color;
    }

    //states of Object
    //Overriding
    @Override
    public String toString() {
        return Color + " : " + Price;
    }

}


class ToString {
    public static void main(String[] args) {
        Marker m1 = new Marker(55, "red");
        //Before Overriding --> it returns ClassName@HashCode.
        System.out.println(m1);
        //After Overriding --> it gives Output
        System.out.println(m1);
        Marker m2 = new Marker(40, "Blue");
        System.out.println(m2);

    }
}