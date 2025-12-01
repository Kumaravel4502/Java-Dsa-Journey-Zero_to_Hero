package CollectionFramework.SoftSauve;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "Kumaravel";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // Ignore spaces if needed
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}

