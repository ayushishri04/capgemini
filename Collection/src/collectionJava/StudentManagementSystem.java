package collectionJava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
class Student {
    String name;
    String password;
    boolean studyMaterialAccess;
    int sem1, sem2, sem3, sem4;
    Student(String name, String password, boolean access) {
        this.name = name;
        this.password = password;
        this.studyMaterialAccess = access;
        Random random = new Random();
        sem1 = random.nextInt(101);
        sem2 = random.nextInt(101);
        sem3 = random.nextInt(101);
        sem4 = random.nextInt(101);
    }
    int getTotalMarks() {
        return sem1 + sem2 + sem3 + sem4;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Create password: ");
        String pass = sc.nextLine();
        System.out.println("\nStudy Material Access:");
        System.out.println("1. Allow");
        System.out.println("2. Deny");
        System.out.print("Choose option: ");

        int option = sc.nextInt();
        boolean access = false;
        switch (option) {
            case 1:
                access = true;
                break;
            case 2:
                access = false;
                break;
            default:
                System.out.println("Invalid");
        }
        students.add(new Student(name, pass,access));
        System.out.println("Registration done");
        System.out.println("Total Students: " + students.size());
        sc.nextLine(); 
        System.out.println("\nlogin");
        System.out.print("Enter name: ");
        String loginName = sc.nextLine();
        System.out.print("Enter password: ");
        String loginPass = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.name.equals(loginName) && s.password.equals(loginPass)) {
                found = true;
                System.out.println("\nLoggd in");
                if (s.studyMaterialAccess) {
                    System.out.println("PDF open");
                } else {
                    System.out.println("Doesnt open");
                }
                System.out.println("\nSemester Marks:");
                System.out.println("Sem1:"+ s.sem1);
                System.out.println("Sem2:"+s.sem2 );
                System.out.println("Sem3:"+s.sem3 );
                System.out.println("Sem4:"+s.sem4 );
                System.out.println("Total Marks: " + s.getTotalMarks());
            }
        }
        if (!found) {
			System.out.println("Invalid credentials");
		}
        sc.close();
        
    }
}
