package Feb6;

import java.util.Scanner;
import java.util.Stack;

public class Engine {

    static Stack<Integer> undo = new Stack<>();

    @SuppressWarnings("resource")
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();
        if (!isValid(exp)) {
            System.out.println("Invalid Expression");
            return;
        }
        String postfix = infixToPostfix(exp);
        int result = evaluatePostfix(postfix);
        undo.push(result);
        System.out.println("Result: " + result);
        undo();
        sc.close();
    }
    static void undo() {
        if (!undo.isEmpty()) {
            undo.pop();
        }

        if (!undo.isEmpty()) {
            System.out.println("After UNDO: " + undo.peek());
        } else {
            System.out.println("No previous result");
        }
    }

    static boolean isValid(String exp) {
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {
            if (ch == '(') stack.push(ch);
            if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    static int pre(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        return 0;
    }
    static String infixToPostfix(String exp) {

        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)) {
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    postfix += exp.charAt(i);
                    i++;
                }
                postfix += " ";  
                i--;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (stack.peek() != '(')
                    postfix += stack.pop() + " ";
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && pre(stack.peek()) >= pre(ch))
                    postfix += stack.pop() + " ";
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            postfix += stack.pop() + " ";

        return postfix;
    }
    static int evaluatePostfix(String exp) {

        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");

        for (String token : tokens) {

            if (token.length() == 0) continue;

            if (Character.isDigit(token.charAt(0))) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                switch (token.charAt(0)) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}
