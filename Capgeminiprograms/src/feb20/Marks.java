package feb20;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Marks implements Serializable {
	int RollNo;
	int Marks;
	public Marks(int rollNo, int marks) {
		super();
		RollNo = rollNo;
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student {RollNo:"+RollNo+"Marks:"+Marks+"}";
	}
	public int getRollNo() {
		return RollNo;
	}
	
	public int getMarks() {
		return Marks;
	}
	}