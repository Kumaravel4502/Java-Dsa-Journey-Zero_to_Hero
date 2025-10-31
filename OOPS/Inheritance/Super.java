package OOPS.Inheritance;

class Super {
    int id = 101;

    public Super() {

    }
}

class Sub extends Super {
    int age = 25;

    public Sub() {

    }
}

class Test {
    public static void main(String[] args) {
        //Access using child class object reference
        Sub child = new Sub();
        System.out.println("Sub class var child age : " + child.age);
        System.out.println("Super class var child id : " + child.id);

        //Access using Parent class object reference
        Super parent = new Super();
        System.out.println("Super class var Parent id : " + parent.id);
//        System.out.println("Sub class var Parent age : "+parent.age); //CTE

    }
}
