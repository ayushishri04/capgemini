package string;

public class StringP2 {

	public static void main(String[] args) {
//		reverse
		String s="Hello";
		String rev="";

		for(int i=s.length()-1;i>=0;i--){
		    rev+=s.charAt(i);
		}
		System.out.println(rev);

//		check palindrome
		String st="madam";
		String reve="";

		for(int i=st.length()-1;i>=0;i--){
		    reve+=st.charAt(i);
		}

		if(st.equals(reve))
		    System.out.println("Palindrome");
		else
		    System.out.println("Not Palindrome");

		//Count words
		String str="Hi Hello World";
		String[] words = str.split(" "); //So the array has 3 elements.
		System.out.println(words.length);


	}

}
