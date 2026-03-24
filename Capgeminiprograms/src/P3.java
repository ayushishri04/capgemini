//max element from the given int array
public class P3 {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int max=a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
