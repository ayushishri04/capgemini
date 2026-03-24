package Feb6;
import java.util.Stack;

public class StockProb {

    static int[] Span(int[] pri) {
        int n = pri.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && pri[i] >= pri[stack.peek()]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        return span;
    }
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = Span(prices);
        for (int x : result) {
            System.out.print(x+ "");
        }
    }
}
