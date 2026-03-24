package relationship;

import java.util.ArrayList;
import java.util.List;

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
class Teacher {
    private List<Student> students;  
    public Teacher(int teacherId, String name) {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class Main4 {

	public static void main(String[] args) {
		Teacher t1 = new Teacher(101,"Mr. Jayesh");
		Student s1 = new Student(1,"Ayushi");
		Student s2 = new Student(2, "Pratishtha");
		t1.addStudent(s1);
		t1.addStudent(s2);
		for(Student s : t1.getStudents()) {
			System.out.println("Student Name: " + s.getName() + ", Roll No: " + s.getRollNo());
		}
		for(Student s : t1.getStudents()) {
			System.out.println("Student Name: " + s.getName() + ", Roll No: " + s.getRollNo());
		}
	}

}

 
