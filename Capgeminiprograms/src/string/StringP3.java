package string;

public class StringP3 {

	public static void main(String[] args) {
		// Remove all occurrences of a character
		String s="banana";
		char ch='a';

		String res = s.replace(ch+"","");
		System.out.println(res);

		//Remove first occurrence of a character
		String st="banana";
		char cha='a';
		System.out.println(st.replaceFirst(cha+"",""));

		

	}

}
