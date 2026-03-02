package twoDarray;
//Find the sum of all elements of a matrix.
//•  Find the sum of each row of a matrix.
//•  Find the sum of each column of a matri
public class Sum {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		int totalSum= 0;
		for(int i =0;i<a.length;i++) {
			int rowSum=0;
			for(int j=0;j<a[i].length;j++) {
				totalSum+=a[i][j];
				rowSum+=a[i][j];
				
			}
			System.out.println(rowSum);
		}			
		System.out.println(totalSum);

		for(int j=0;j<a[0].length;j++) {
			int colSum=0;
			for(int i=0;i<a.length;i++) {
				colSum+=a[i][j];
			}
			System.out.println(colSum);
		}
	}

}
