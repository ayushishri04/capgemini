// sum of all even indexed elements
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,10,15};
		int sum=0;
		for(int i =0;i<a.length;i++) {
			if(i%2==0) {
				sum+=a[i];
			}
		}
		System.out.println(sum);

	}

}
