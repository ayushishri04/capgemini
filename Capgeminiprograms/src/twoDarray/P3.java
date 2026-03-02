package twoDarray;
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int m = sc.nextInt(); // rows
	        int n = sc.nextInt(); // columns

	        int[][] a = new int[m][n];
	        int totalSum = 0;

	        // Read matrix
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                a[i][j] = sc.nextInt();

	        // Sum of all elements
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                totalSum += a[i][j];

	        System.out.println("Sum of all elements: " + totalSum);

	        // Sum of each row
	        for (int i = 0; i < m; i++) {
	            int rowSum = 0;
	            for (int j = 0; j < n; j++)
	                rowSum += a[i][j];
	            System.out.println("Sum of row " + i + ": " + rowSum);
	        }

	        // Sum of each column
	        for (int j = 0; j < n; j++) {
	            int colSum = 0;
	            for (int i = 0; i < m; i++)
	                colSum += a[i][j];
	            System.out.println("Sum of column " + j + ": " + colSum);
	        }

	        sc.close();
	}

}
