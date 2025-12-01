package CollectionFramework.SoftSauve;


import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char result = '-';
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                result = c;
                break;
            }
        }
        if (result == '-') {
            System.out.println(-1);
        } else {
            System.out.println("First non-repeating: " + result);
        }
    }
}


