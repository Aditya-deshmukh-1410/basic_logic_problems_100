package Strings;

public class ParenthesisCheck {
	public static void main(String[] args) {
		
		String str = "((a+b))(";
		int count = 0;  
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				count++;
			}
			if (str.charAt(i) == ')') {
				count--;
			}
		}
		
		if(count == 0) {
			System.out.println("Valid Parenthesis");
		} else {
			System.out.println("invalid parenthesis");
		}
		
	}

	
}
