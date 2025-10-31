package OOPS.MethodReference.ConstructorRef;

//Syntax : ClassName :: new  --> new Keyword

interface Sports {
    void play(String msg);
}

public class Cricket {
    Cricket(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Sports s1 = Cricket::new;
        s1.play("Cricket");
    }
}
