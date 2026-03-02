package practice;
import java.util.*;
//Input integer salary.
//If salary < 0 print "Invalid" using exception.
public class HRpattern{
    @SuppressWarnings("resource")
	public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        try{
            int salary=sc.nextInt();

            if(salary<0){
                throw new Exception("Invalid");
            }

            System.out.println("Valid");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}