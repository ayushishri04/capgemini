package practice;
//Given a sentence, print all words having length ≥ 4 (ignore punctuation).

import java.util.*;
class WordCount{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input = sc.nextLine();
		String[] words = input.replaceAll("[^a-zA-Z ]", "").split(" ");
		for(String w: words) {
			if(w.length()>=4) {
				System.out.println(w);
			}
		}
		
	}
}
