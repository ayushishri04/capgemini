//avg value from a first half
public class P12 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		int sum=0;
		int avg=0;
		int mid=a.length/2;
		for(int i=0;i<mid;i++) {
			sum+=a[i];
		}
//		for(int i=mid;i<a.length;i++) {
//			sum+=a[i];
//		}
	 avg=sum/mid;
		System.out.println(avg);
	}
	

}
