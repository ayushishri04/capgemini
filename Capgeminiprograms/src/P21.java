//Swap two given indexed elements 
// Swap odd indexed elements with its immediate next even indexed elements
public class P21 {

	public static void main(String[] args) {
		int arr[]= {5,10,15,20};
		        int i = 1;
		        int j = 3;

		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		        for (int k = 0; k < arr.length; k++) {
		            System.out.print(arr[k]+ " ");
//		int i=1;//odd index
//		int temp=arr[i];
//		arr[i]=arr[i+1];
//		arr[i+1]=temp;
//		for(int x=0;x<arr.length;x++) {
//			System.out.println(arr[x]+ " ");
//		}
		        }

	}

}
