package practice;
import java.util.*;
//Print frequency of each word.
public class Frequency{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine().toLowerCase();
		String[] words= input.split(" ");
		HashMap<String,Integer> map = new HashMap<>();
		for(String w: words) {
			map.put(w,map.getOrDefault(w, 0)+1);
		}
		for(String key: map.keySet()) {
			System.out.println(key+ " " +map.get(key));
		}
	}
}