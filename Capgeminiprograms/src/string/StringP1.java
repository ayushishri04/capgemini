package string;

public class StringP1 {
	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.toUpperCase());
		
		String st = "Hello123!";
		int v=0,c=0,d=0,sp=0;
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				if("aieouAEIOU".indexOf(ch)!= -1)v++; 
				else c++;
				
			}else if (ch>='0' && ch<='9')d++;
			else sp++;
		}
		System.out.println("Vowels:"+v+" Consonants:"+c+" Digits:"+d+" Special:"+sp);
		
		String str="HeLLo";
		String result="";

		for(int i=0;i<str.length();i++){
		    char ch = str.charAt(i);
		    if(i%2==0) result += Character.toUpperCase(ch);
		    else result += Character.toLowerCase(ch);
		}
		System.out.println(result);

	}

}
