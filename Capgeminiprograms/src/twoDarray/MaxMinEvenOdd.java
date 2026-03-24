package twoDarray;

public class MaxMinEvenOdd {

	public static void main(String[] args) {
		int[][] a = {
	            {3, 5, 8},
	            {2, 7, 6},
	            {9, 4, 1}
	        };

	        int max = a[0][0];
	        int min = a[0][0];
	        int evenCount = 0, oddCount = 0;

	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < a[i].length; j++) {

	                if (a[i][j] > max) max = a[i][j];
	                if (a[i][j] < min) min = a[i][j];

	                if (a[i][j] % 2 == 0)
	                    evenCount++;
	                else
	                    oddCount++;
	            }
	        }

	        System.out.println("Maximum = " + max);
	        System.out.println("Minimum = " + min);
	        System.out.println("Even count = " + evenCount);
	        System.out.println("Odd count = " + oddCount);

	}

}
