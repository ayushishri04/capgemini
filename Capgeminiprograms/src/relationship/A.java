package relationship;


public interface A {

	static void disp(){
		
	}
	void display();
	void demo();
	
}
interface B extends A{
	//demo
	//display
}
  class C implements A,B{

	public void demo(){
		System.out.println("Hello");
	}
	
	public void display() {
		System.out.println("hiii overriden");
	}
 }