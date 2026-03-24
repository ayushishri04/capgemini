//min value from all even indexed elements
public class P8 {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				if(a[i]<min) {
					min=a[i];
				}
			}
		}
		System.out.println(min);
	}

}
