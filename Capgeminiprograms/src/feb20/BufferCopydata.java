package feb20;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class BufferCopydata {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new FileReader("Data.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copydata.text"));
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
		System.out.println("File Copied");
	}
}
