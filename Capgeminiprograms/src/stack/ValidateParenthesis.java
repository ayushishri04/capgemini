package stack;

import java.util.Stack;

// to check parenthesis is valid or not
public class ValidateParenthesis {

    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([])";
        String s1 = "(())";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
    }
}
