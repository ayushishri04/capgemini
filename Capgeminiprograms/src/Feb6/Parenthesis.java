package Feb6;
import java.util.Stack;

public class Parenthesis {

    public static String makeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            }
            else if (arr[i] == ')') {
                if (stack.isEmpty()) {
                    arr[i] = '#';
                } else {
                    stack.pop();
                }
            }
        }
        while (!stack.isEmpty()) {
            arr[stack.pop()] = '#';
        }
        StringBuilder result = new StringBuilder();
        for (char c : arr) {
            if (c != '#') {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "a)b(c)d";
        System.out.println(makeValid(s));
    }
}
