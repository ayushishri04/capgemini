package threading;

//basic idea
//while(n/w is connected) {
//	line= sc,readLine();
//	object.run(); Thread.start(); will call run in another Thread and return at the same time
//	print 1
//	print 2
//	print 3
//	
//	send it over n/w
//	read a line from n/w
//	show it on a screen
//}


//2 methods to create thread in java
// 1 extend the thread class
class ChildThread extends Thread{
	public void run() {
		Thread thread=Thread.currentThread();
        System.out.println("child :" +thread);
		for(int i=1;i<=10;i++) {
			System.out.println("child :" + i);
		}
	}
}
//base class always derive class

//runnable interface
class ChildThread2 implements Runnable{
	@Override
	public void run() {
		  Thread thread=Thread.currentThread();
	        System.out.println("child 2:" +thread);
		for(int i=1;i<=10;i++) {
			System.out.println("child2 :" + i);
		}
	}
}
public class ThreadingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=Thread.currentThread();
        System.out.println("main:"+thread);
		ChildThread t = new ChildThread();
//		Thread thread = new Thread.currentThread();
		t.start(); //will execute run in new thread and return at the same time
		ChildThread2 obj = new ChildThread2();
		Thread t2 = new Thread(obj);
		t2.setName("ChildThread");
		t2.setPriority(10);
		t2.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main :" + i);
		}
	}

}

