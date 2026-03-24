package twoDarray;
//•  Find the largest element in each row.
//•  Find the smallest element in each column.
import java.util.Scanner;
public class LargestSmallest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<a.length;i++) {//read
			for(int j=0;j<a[i].length;j++) {
				a[i][j]= s.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			int rowMax= a[i][0]; //assign max to 1st 
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>rowMax) {
					rowMax=a[i][j];
				}
			}
			System.out.println("Largest in row" + " " + rowMax);
		}
		for(int j=0;j<a[0].length;j++) {
			int colMin=a[0][j];
			for(int i=1;i<a.length;i++) {
				if(a[i][j]<colMin) {
					colMin=a[i][j];
				}
			}
			System.out.println("Smallest in col: " + " " + colMin);
		}
		s.close();

	}

}
