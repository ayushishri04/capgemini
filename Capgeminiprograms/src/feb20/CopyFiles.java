package feb20;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stuB

		FileInputStream fin  = new FileInputStream("data.txt");
		FileOutputStream fout = new FileOutputStream("dataCopy.txt");
		int ch;
		while((ch = fin.read()) != -1){
		    fout.write(ch);
		}
		fin.close();
		fout.close();
		System.out.println("File copied");
		System.out.println(System.getProperty("user.dir"));
	}

}
