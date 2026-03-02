package twoDarray;
//print character in 4 3 matrix
public class array2DChar {

	public static void main(String[] args) {
		        char[][] a = new char[4][3];
		        char ch = 'a';
		        for (int row = 0; row < a.length; row++) {
		            for (int col = 0; col < a[row].length; col++) {
		                a[row][col] = ch++;
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


