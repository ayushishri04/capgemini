package practice;
import java.util.*;
//Reverse each word in a sentence. USING STRING BUILDER
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String input= sc.nextLine().toLowerCase();
		String[] words = input.split(" ");
		
		
		for(String s: words) {
			StringBuilder sb = new StringBuilder(s);
			System.out.println(sb.reverse()+ " ");
		}
		sc.close();

	}

}
