package Feb6;
import java.util.Stack;

public class Histogram {

    public static int largestRec(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxA = 0;
        int i = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            }
            else {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = height * width;
                maxA = Math.max(maxA, area);
            }
        }
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = height * width;
            maxA = Math.max(maxA, area);
        }
        return maxA;
    }
    public static void main(String[] args) {
        int[] bars = {6, 2, 5, 4, 5, 1, 6};
        System.out.println("Largest Rectangle Area = " + largestRec(bars));
    }
}
