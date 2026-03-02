// Read only even indexed elements from an array
// Read only even indexed elements from an array in the reverse order
public class P18 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		for(int i=0;i<a.length;i++) {
		//for(int i=a.length-1;i>=0;i--) {
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
