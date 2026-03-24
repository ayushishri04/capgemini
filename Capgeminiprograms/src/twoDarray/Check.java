package twoDarray;

public class Check {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{1,2},{3,4}};
		boolean equal =true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]!=b[i][j]) {
					equal=false;
					break;
				}
			}
		}
		if(equal) {
			System.out.println("matrices are equal");
		}else {
			System.out.println("matrices are not equal");
		}

	}

}
