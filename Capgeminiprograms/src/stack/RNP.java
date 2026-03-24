//package stack;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class RNP {
//
//    static int precedence(char ch) {
//        if (ch == '+' || ch == '-') return 1;
//        if (ch == '*' || ch == '^') return 2;
//        return 0;
//    }
//    static String infixToPostfix(String infix) {
//        Stack<Character> stack = new Stack<>();
//        String postfix = "";
//        for (char ch : infix.toCharArray()) {
//            if (ch == ' ') continue;
//            if (Character.isLetter(ch)) {
//                postfix += ch;
//            }
//            else if (ch == '(') {
//                stack.push(ch);
//            }
//            else if (ch == ')') {
//                while (!stack.isEmpty() && stack.peek() != '(') {
//                    postfix += stack.pop();
//                }
//                stack.pop(); 
//            }
//            else {
//                while (!stack.isEmpty() &&
//                        precedence(stack.peek()) >= precedence(ch)) {
//                    postfix += stack.pop();
//                }
//                stack.push(ch);
//            }
//        }
//        while (!stack.isEmpty()) {
//            postfix += stack.pop();
//        }
//        return postfix;
//    }
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of expressions: ");
//        int n = sc.nextInt();
//        sc.nextLine(); 
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter infix expression " + i + ": ");
//            String infix = sc.nextLine();
//            String postfix = infixToPostfix(infix);
//            System.out.println("Reverse Polish Notation: " + postfix);
//        }
//    }
//}
