package feb20;

import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFileDemo {
//you can read the data byte by byte
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		RandomAccessFile file = new RandomAccessFile("data.txt","r");
		for(int i=1;i<250;i++) {
			int j =file.read();
			System.out.println((char) j);
			if(i%5==0) file.skipBytes(3);
		}
	}

}
