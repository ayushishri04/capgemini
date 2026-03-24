//sum of all odd indexed elements
public class P7 {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int sum=0;
		for(int i =0;i<a.length;i++) {
			if(i%2!=0) {
				sum+=a[i];
			}
		}
System.out.println(sum);
	}

}
