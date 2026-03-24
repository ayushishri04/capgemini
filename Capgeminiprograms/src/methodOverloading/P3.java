package methodOverloading;

public class P3 {

	    void display(int a) {
	        System.out.println("Integer value: " + a);
	    }

	    void display(String s) {
	        System.out.println("String value: " + s);
	    }

	    void display(double d) {
	        System.out.println("Double value: " + d);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 P3 obj = new P3();
	        obj.display(10);
	        obj.display("Hello Java");
	        obj.display(45.6);

	}

}
