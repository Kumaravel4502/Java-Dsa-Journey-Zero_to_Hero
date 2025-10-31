package OOPS.MethodReference.NonStaticMethod;


interface Sports{
    void play(String msg);
}
public class Cricket {
    Cricket(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Sports s1=Cricket::new;
        s1.play("Cricket");
    }
}
