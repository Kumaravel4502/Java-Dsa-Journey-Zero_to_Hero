package OOPS.Interface;

interface Qspider{
    void teach();
}
interface Jspider{
    void teach();
}
public class Trainer {
    public static void main(String[] args) {
        Qspider qsp=new Qspider() {
            @Override
            public void teach() {
                System.out.println("Tecah something Qsp");
            }
        };
        qsp.teach();

        Jspider jsp=new Jspider() {
            @Override
            public void teach() {
                System.out.println("Tech Jspider");
            }
        };
        jsp.teach();
    }
}
