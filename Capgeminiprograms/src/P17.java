// Read first half of the elements in the reverse direction 
public class P17 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		int mid=a.length/2;
		for(int i = mid-1;i>=0;i--) {
		//Read second half of the elements in the reverse direction
//			for(int i =a.length-1;i>=mid;i-- ) {
			System.out.println(a[i]);
		}
	}

}
