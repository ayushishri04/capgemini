package feb20;
//give odd index characters
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class OddIndex {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("data.txt");
		FileOutputStream fout = new FileOutputStream("oddIndex.txt");
		int ch;
		int index=0;
		while((ch= fin.read()) != -1){
			if(ch!=' ') {
		    if(index%2!=0)
		        fout.write(ch);
		    index++;
		}}
		fin.close();
		fout.close();
		System.out.println("File copied");

	}

}
