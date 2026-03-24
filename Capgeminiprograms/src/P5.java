//avg of element
public class P5 {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int sum=0;
		int avg=0;
		for(int i =0;i<a.length;i++) {
			sum+=a[i];
		}
		avg=sum/a.length;
		System.out.println(avg);
	}

}
