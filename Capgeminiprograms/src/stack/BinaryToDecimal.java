//package stack;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class BinaryToDecimal {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Stack<Integer> stack = new Stack<>();
//
//        System.out.print("Enter binary number: ");
//        int binary = sc.nextInt();
//        while (binary > 0) {
//            stack.push(binary % 10);
//            binary = binary / 10;
//        }
//
//        int decimal = 0;
//        while (!stack.isEmpty()) {
//            int digit = stack.pop();
//            decimal = decimal * 2 + digit;
//        }
//
//        System.out.println("Decimal value: " + decimal);
//    }
//}
