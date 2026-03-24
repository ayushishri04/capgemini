//avg value from all even indexed & odd index
public class P10 {

	public static void main(String[] args) {
		int a[]= {5,10,15};
		int sum=0;
		int avg=0;
		for(int i =0;i<a.length;i++) {
			if(i%2==0) {
				sum+=a[i];
			}
//			if(i%2!=0) {
//				sum+=a[i];
//	}
		}
		avg=sum/a.length;
		System.out.println(avg);
		
		
	}

}
