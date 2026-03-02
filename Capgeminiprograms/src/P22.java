//Do right shift by one for elements of given array
public class P22 {

	public static void main(String[] args) {
		int[] a = {5, 10, 15, 20};
//		int last=a[3]; //a[a.length-1]
//		for(int i=3;i>0;i--) {
//			a[i]=a[i-1];
//		}a[0]=last; //outside the loop as it only has to run one time
//			for(int  x=0;x<a.length;x++) {
//				System.out.println(a[x]+ " ");
//			}
		//Do right shift by one for elements of given array
		for (int k=0;k<2;k++) {
			int last =a[a.length-1];
			for(int i=a.length-1;i>0;i--) {
				a[i]=a[i-1];
			}a[0]=last;
		}
		for(int x=0;x<a.length;x++) {
			System.out.println(a[x]);
		}
		
	}

}