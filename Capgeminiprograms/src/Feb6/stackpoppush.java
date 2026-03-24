package Feb6;
import java.util.LinkedList;
import java.util.Queue;
public class stackpoppush {

    static class CostlyPushStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        void push(int a) {
            q2.add(a);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }
        int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }
    }
    static class CostlyPopStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        void push(int x) {
            q1.add(x);
        }
        int pop() {
            if (q1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            while (q1.size() > 1) {
                q2.add(q1.remove());
            }

            int popped = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return popped;
        }
    }

    public static void main(String[] args) {

        System.out.println("Push");
        CostlyPushStack s1 = new CostlyPushStack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1.pop()); 
        System.out.println(s1.pop()); 
        System.out.println("\nPop");
        CostlyPopStack s2 = new CostlyPopStack();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        System.out.println(s2.pop());
    }
}
