package threading;
class Printer{
	//synchronized
	public void print(String msg) throws InterruptedException{
		System.out.println("[");
		Thread.sleep(2000);
		System.out.println(msg);
		System.out.println("]");
	}
}
class Writer extends Thread{
	Printer printer;
	String msg;
	public Writer(Printer printer, String msg) {
		super();
		this.printer = printer;
		this.msg=msg;
	}
	public void run() {
		try{
			synchronized(printer){
			printer.print(msg);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SynchDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		Writer w1 = new Writer(printer, "Java");
		Writer w2 = new Writer(printer, "Threads");
		w1.start();
		w2.start();
	}

}
