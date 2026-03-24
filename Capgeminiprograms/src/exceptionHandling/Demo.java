package exceptionHandling;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");//Main Start
		int a =10;//10
		int b=0;//	0
		int res=a/b;//ArithmeticException: / by zero
		System.out.println(res);
		 System.out.println("Main End");//will not be printed

	}

}

