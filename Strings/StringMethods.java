
import java.util.*;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Kumaravel D Hello";

        // Convert the string into a character array and print it
        System.out.println(Arrays.toString(name.toCharArray()));

        // Find the first index of character 'a'
        System.out.println(name.indexOf('a'));

        // Find the last index of character 'a'
        System.out.println(name.lastIndexOf('a'));

        // Replace character 'u' with 'o'
        System.out.println(name.replace('u', 'o'));

        // Check if the string contains the sequence "Kuma"
        System.out.println(name.contains("Kuma"));

        // Remove leading and trailing spaces from the string
        System.out.println("    Kumar       ".strip());

        // Split the string into parts wherever there is a space
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
