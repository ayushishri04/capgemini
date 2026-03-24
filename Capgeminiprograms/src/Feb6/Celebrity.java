package Feb6;
import java.util.Scanner;
import java.util.Stack;
public class Celebrity {
    static int find(int[][] M, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (M[a][b] == 1) {
                // a knows b → a is not celebrity
                stack.push(b);
            } else {
                // a does not know b → b is not celebrity
                stack.push(a);
            }
        }
        int candidate = stack.pop();
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                if (M[candidate][i] == 1 || M[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int[][] M = new int[n][n];

        System.out.println("Enter matrix values (0 or 1):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }
        int result = find(M, n);
        if (result == -1) {
            System.out.println("No Celebrity Found");
        } else {
            System.out.println("Celebrity is person: " + result);
        }
        sc.close();
    }
}
