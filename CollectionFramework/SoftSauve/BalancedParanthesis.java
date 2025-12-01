package CollectionFramework.SoftSauve;

import java.util.*;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String s = "{[()]}";
        System.out.println(isBalanced(s) ? "Balanced" : "Not Balanced");
    }


    static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if (!isMatching(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

}


