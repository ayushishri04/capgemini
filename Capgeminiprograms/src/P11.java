// sum of all elements from a first half of given int array
public class P11 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		int mid=a.length/2;
		int sum =0;
		for(int i=0;i<mid;i++) {
		sum+=a[i];
	}
		/*sum of all elements from a second half of given int array
		for(int i=mid;i<a.length;i++) {
			sum+=a[i];
		}*/
		System.out.println(sum);
	}

}

        