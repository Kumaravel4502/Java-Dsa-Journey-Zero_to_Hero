package CollectionFramework.Stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static void main(String[] args) {

        String s = "[{()}]";
        char[] ch = s.toCharArray();

        Stack<Character> bag = new Stack<>();
        boolean balanced = true;

        for (char x : ch) {

            // Opening brackets
            if (x == '[' || x == '{' || x == '(') {
                bag.push(x);
            }
            // Closing brackets
            else if (x == ']' || x == '}' || x == ')') {

                // Stack empty? mismatched bracket
                if (bag.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = bag.pop();

                // Mismatch of pairs
                if ((x == ']' && top != '[') ||
                        (x == '}' && top != '{') ||
                        (x == ')' && top != '(')) {
                    balanced = false;
                    break;
                }
            }
        }

        // After full loop, stack must be empty
        if (!bag.isEmpty()) {
            balanced = false;
        }

        if (balanced)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
