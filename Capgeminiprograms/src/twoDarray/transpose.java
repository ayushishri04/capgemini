package twoDarray;

public class transpose {

	public static void main(String[] args) {
		int a[][]= new int[3][4];//{{1,2,3,4},{5,6,7,8},{9,10,11,12}};//3*4 
		int num=1;
		int T [][]= new int [4][3];
		for(int row=0;row<a.length;row++) {
			for(int col=0;col<a[row].length;col++) {
				a[row][col]=num++;
				T[col][row]=a[row][col];
			}
		}
		for(int row=0;row<T.length;row++) {
			for(int col=0;col<T[row].length;col++) {
				System.out.print(T[row][col]+ " ");
			}		System.out.println();

		}
	}

}
