// Do left shift by one for elements of given array?
// Do left shift by two for elements of given array?
// Do left shift by three for elements of given array
public class P23 {

	public static void main(String[] args) {
		int a[]= {5,10,15,20};
		int first=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}a[a.length-1]=first;
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x]+ " "); 
		}
//        int times =3;
//        for(int k=0;k<times;k++) {
//        	int first=a[0]; //saves first element
//        	for(int i=0;i<a.length-1;i++) {
//            	a[i]=a[i+1];//shifts left
//            }
//        	a[a.length-1]=first;//put first element at end
//        }
//            for(int x=0;x<a.length;x++) {
//            	System.out.print(a[x]+ " ");
//            }

	}

}
