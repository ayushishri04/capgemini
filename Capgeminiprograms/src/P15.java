//Read only even indexed elements
public class P15 {

	public static void main(String[] args) {
		int arr[]= {5,10,15,20};
		for (int i = 0; i < arr.length; i += 2) {
		    System.out.print(arr[i] + " ");
		}
//Read only even indexed elements from an array in the reverse order
//		for (int i = (arr.length - 1) / 2 * 2; i >= 0; i -= 2) {
//		    System.out.print(arr[i] + " ");
//		}
	}

}
