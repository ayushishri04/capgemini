package generics;
class StkGenerics<T>{
//	int[] a= new int[10]; //we will not declare int array we will declare object as it has all types
	Object a[]=new Object[10];
	int top=-1;
	public void push(T x) {
		a[++top]=x;
	}
	 @SuppressWarnings("unchecked")
	 T pop() {
		return (T) a[top--];
	}
}
public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StkGenerics<Integer> s1=new StkGenerics<>();
		s1.push(34);
		s1.push(55);
		s1.push(65);
		StkGenerics<String> s2 = new StkGenerics<>();
		s2.push("Bhavya");
		s2.push("Vaduni");
		s2.push("Ayushi");

		System.out.println(s1.pop());
        System.out.println(s2.pop());

	}

}
