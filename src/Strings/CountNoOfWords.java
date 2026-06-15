package Strings;

public class CountNoOfWords {
	
	// eg: - Hello world  -> 2 words differentiated by the space ' '
	public static void main(String[] args) {
		
		String str = "Hello world hey";
		int count = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		
		System.out.println("total words in the strings are: "+count); // 3 words s
		
	}

}
