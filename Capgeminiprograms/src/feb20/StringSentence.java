package feb20;
//String sentnce = "this is line.Line contains few words. Line is in Java"
//positions of "line" : 8,14,39
public class StringSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "this is line.Line contains few words.Line is in java";
		String word = "line";
		int index = sentence.indexOf(word);
		while(index != -1) {
			System.out.println("position of" + word + index);
			index = sentence.indexOf(word, index+1);
		}
	}

}
