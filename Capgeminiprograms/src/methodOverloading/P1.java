package methodOverloading;
public class P1 {

	    void add(int a, int b) {
	        System.out.println("Sum of two integers: " + (a + b));
	    }
	    void add(int a, int b, int c) {
	        System.out.println("Sum of three integers: " + (a + b + c));
	    }
	    void add(float a, float b) {
	        System.out.println("Sum of two floats: " + (a + b));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 P1 obj = new P1();
	        obj.add(10, 20);
	        obj.add(5, 6, 7);
	        obj.add(2.5f, 3.5f);

	}
	

}
