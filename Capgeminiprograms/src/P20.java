//Find out an index of a specified element from a given array
public class P20 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		int I = 10;
		for(int i=0;i<a.length;i++) {
			if(a[i]==I) {
				System.out.println(i);
			}
		}
	}

}
