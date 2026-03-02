package feb20;

import java.io.RandomAccessFile;

public class Last2Bytes {
	public static void main(String[] args) throws Exception {
		RandomAccessFile file=new RandomAccessFile("data.txt","r");
//		long l = file.length();
//        if (l < 2) {
//            System.out.println("Errror");
//        } else {
//            file.seek(l - 3);
//            char ch1 = (char) file.read();
//            char ch2 = (char) file.read();
//            System.out.println("Last two characters: " + ch1 + ch2);
//        }
//        file.close();
        file.seek(file.length()-2);
        System.out.println((char) file.read()+"" +(char)file.read());
        file.close();
	}

}