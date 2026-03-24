//Do right rotate by one for elements of given array
// Do right rotate by two for elements of given array
//Do right rotate by three for elements of given array
public class P24 {

	public static void main(String[] args) {
		
		        int[] arr = {5, 10, 15, 20};
		        int last = arr[arr.length - 1]; // save last element
		        for (int i = arr.length - 1; i > 0; i--) {
		            arr[i] = arr[i - 1];// shift elements to the right
		        }

		        arr[0] = last; // put last element at first position
		        for (int x = 0; x < arr.length; x++) {
		            System.out.print(arr[x] + " ");
		        }
//		        int times = 2; 
//		        for (int k = 0; k < times; k++) {
//		            int last = arr[arr.length - 1]; 
//		            for (int i = arr.length - 1; i > 0; i--) {
//		                arr[i] = arr[i - 1];
//		            }
//		            arr[0] = last; 
//		        }
//		        for (int x = 0; x < arr.length; x++) {
//		            System.out.print(arr[x] + " ");
//		        }
	}

}
