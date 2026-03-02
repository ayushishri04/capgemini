package linkedList;
//to check parenthesis is valid or not
public class ParenthesisValidation {
	static boolean isValid(String s) {
		java.util.Stack<Character> stack = new java.util.Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) return false;
				char top = stack.pop();
				if ((c == ')' && top != '(') ||
					(c == '}' && top != '{') ||
					(c == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
