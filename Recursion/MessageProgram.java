// Write a function that prints a message Hello Kumaravel

public class MessageProgram {

    public static void main(String[] args) {
        printMessage(5);
    }

    static void printMessage(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Hello Kumaravel");
        printMessage(n - 1);

    }
}  