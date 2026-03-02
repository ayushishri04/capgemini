package twoDarray;

public class P1 {

	public static void main(String[] args) {
		 int[][] a = new int[4][3];
	        int num = 1;
	        for (int row = 0; row < a.length; row++) {
	            for (int col = 0; col < a[row].length; col++) {
	                a[row][col] = num++;
	            }
	        }
	        for (int row = 0; row < a.length; row++) {
	            for (int col = 0; col < a[row].length; col++) {
	                System.out.print(a[row][col] + " ");
	            }
	            System.out.println();
	        }
	}

}

