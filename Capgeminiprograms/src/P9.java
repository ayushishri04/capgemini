//max value from all odd indexed elements 
public class P9 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		int max=a[0];
		for(int i =0;i<a.length;i++) {
			if(i%2!=0) {
				if(a[i]>max) {
					max=a[i];
				}
			}
		}
		System.out.println(max);
	}

}
