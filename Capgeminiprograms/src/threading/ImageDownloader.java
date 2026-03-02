package threading;

import java.util.ArrayList;
import java.util.List;

class Downloader implements Runnable{ //or extends Thread
	String images;
	Downloader (String images){
		this.images = images;
	}
	@Override
	public void run() {
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(" downloading: " + images);
	}
}
public class ImageDownloader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String images[]= {"image1","image2","image3"};
		List<Thread> list = new ArrayList<>();
		for(int i =0;i<images.length;i++) {
			Downloader task = new Downloader(images[i]); 
            Thread loader = new Thread(task);  
//			Thread loader = new Thread(images[i]);
//			Thread thread = new Thread(loader);
//			thread.start();
			list.add(loader);
			loader.start();
		}
		for(Thread thread: list) {
			thread.join();//let it finish main will wait till loader thread finished
		}
		System.out.println("All images downloaded");
	}
}
