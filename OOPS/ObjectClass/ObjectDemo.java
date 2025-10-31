package OOPS.ObjectClass;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(33);
        ObjectDemo obj2 = new ObjectDemo(33);

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equals to obj2");
        }

    }

}
