package Feb6;
import java.util.Scanner;
import java.util.Stack;
class MinMaxStack {
    Stack<Integer> stack = new Stack<>();
    int min, max;
    void push(int x) {
        if (stack.isEmpty()) {
            min = max = x;
            stack.push(x);
        } 
        else if (x < min) {
            stack.push(2 * x - min); 
            min = x;
        } 
        else if (x > max) {
            stack.push(2 * x - max); 
            max = x;
        } 
        else {
            stack.push(x);
        }
        System.out.println("Pushed: " + x);
    }
    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int top = stack.pop();

        if (top < min) {
            System.out.println("Popped: " + min);
            min = 2 * min - top;
        } 
        else if (top > max) {
            System.out.println("Popped: " + max);
            max = 2 * max - top;
        } 
        else {
            System.out.println("Popped: " + top);
        }
    }
    void getMin() {
        if (!stack.isEmpty())
            System.out.println("Minimum: " + min);
    }
    void getMax() {
        if (!stack.isEmpty())
            System.out.println("Maximum: " + max);
    }
}

public class stackMinMax {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        MinMaxStack s = new MinMaxStack();

        while (true) {
            System.out.println("\n1.Push  2.Pop  3.GetMin  4.GetMax  5.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.getMin();
                    break;

                case 4:
                    s.getMax();
                    break;

                case 5:
                    System.out.println("Exited");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
