//Read first half of the elements in the reverse direction 
public class P14 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		for (int i = a.length / 2 - 1; i >= 0; i--) {
		    System.out.print(a[i] + " ");
		}
//Read second half of the elements in the reverse direction 
//		for (int i = a.length - 1; i >= a.length / 2; i--) {
//		    System.out.print(a[i] + " ");
//		}

	}

}
