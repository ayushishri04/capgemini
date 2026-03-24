package fileHandling;
import java.io.File;
import java.io.IOException;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//file handling: create, read, update, delete
		File f = new File("abc.txt");
		try {
			f.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
