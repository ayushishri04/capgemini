//2nd max element
public class P4 {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int max= a[0];
		int secondMax =a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}else if(a[i]>secondMax) {
				secondMax=a[i];
			}
		}
		System.out.println(secondMax);
	}

}
