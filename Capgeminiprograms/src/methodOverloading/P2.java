package methodOverloading;

public class P2 {
	    void calculate(int a, int b) {  
	        System.out.println("Addition: " + (a + b));
	    }
	    void calculate(int a, int b, char op) { 
	        if (op == '-') {
	            System.out.println("Subtraction: " + (a - b));
	        } else if (op == '*') {
	            System.out.println("Multiplication: " + (a * b));
	        }
	    }

	    void calculate(double a, double b) { // division
	        System.out.println("Division: " + (a / b));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2 c = new P2();
		c.calculate(10, 5);
		c.calculate(10, 5, '-');
		c.calculate(10, 5, '*');
		c.calculate(10.0, 2.0);

	}

}
