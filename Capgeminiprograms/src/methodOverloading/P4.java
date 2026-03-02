package methodOverloading;

public class P4 {
	    void area(double r) {   // circle
	        System.out.println("Area of Circle: " + (3.14 * r * r));
	    }

	    void area(int l, int b) {   // rectangle
	        System.out.println("Area of Rectangle: " + (l * b));
	    }

	    void area(double b, double h, boolean t) {  // triangle
	        System.out.println("Area of Triangle: " + (0.5 * b * h));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 P4 obj = new P4();
	        obj.area(7.5);
	        obj.area(10, 20);
	        obj.area(5.0, 12.0, true);

	}

}
