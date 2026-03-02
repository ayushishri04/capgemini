package feb20;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter roll:");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name:");
			String name = sc.next();
			
			System.out.println("Information:");
			System.out.println("Roll : " + roll);
			System.out.println("Name:"+name);
			sc.close();

	}

}