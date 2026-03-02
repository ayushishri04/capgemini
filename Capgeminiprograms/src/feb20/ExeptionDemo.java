package feb20;
import java.util.*;
import java.util.Scanner;
//write a program to read 5 integers and calculate the sum
//user can enter wrong data like abc
//you have to read 5 integers till the time these are entered correctly
//use exception handling
//scanner class to read data from user
public class ExeptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new java.util.Scanner(System.in);
		for (int i=0;i<5;i++) {
			System.out.println("Enter");
			try {
				int n=sc.nextInt();
				sum=sum+n;
			}
			catch(InputMismatchException e) {
				System.out.println("Please Enter Integer");
				
			}
			catch(IllegalStateException e) {
				System.out.println("Scanner is closed");
			}
			catch(NoSuchElementException e) {
				System.out.println("No more input");
			}
			catch(Exception e) {
				System.out.println("Please Enter Integer");
				sc.nextLine(); 
				i--; 
				continue; 
			}
		}
		System.out.println("Sum = " + sum);
        sc.close();
	}
	
}
