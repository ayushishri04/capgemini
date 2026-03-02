package practice;
import java.util.*;
//Remove duplicates and print sorted order.
public class removeDuplicates {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		HashSet<Integer> set = new HashSet<Integer>(list);
		ArrayList<Integer> result = new ArrayList<>(set);
		
		Collections.sort(result);
		for(int x:result) {
			System.out.println(x+ " ");
		}

	}

}
