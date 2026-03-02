//package stack;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class ReversePolishNotation {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of expressions: ");
//        int n = sc.nextInt();
//        sc.nextLine();
//        for (int i = 1; i <= n; i++) {
//            System.out.print("Enter RPN expression " + i + ": ");
//            String expr = sc.nextLine();
//            Stack<Integer> stack = new Stack<>();
//
//            String[] tokens = expr.split(" ");
//
//            for (String token : tokens) {
//                if (Character.isDigit(token.charAt(0))) {
//                    stack.push(Integer.parseInt(token));
//                }
//                else {
//                    int b = stack.pop();
//                    int a = stack.pop();
//
//                    switch (token) {
//                        case "+":
//                            stack.push(a + b);
//                            break;
//                        case "-":
//                            stack.push(a - b);
//                            break;
//                        case "*":
//                            stack.push(a * b);
//                            break;
//                        case "/":
//                            stack.push(a / b);
//                            break;
//                    }
//                }
//            }
//
//            System.out.println("Result: " + stack.pop());
//        }
//    }
//}
//
//
