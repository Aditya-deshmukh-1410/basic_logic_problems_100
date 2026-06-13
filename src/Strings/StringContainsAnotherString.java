package Strings;

public class StringContainsAnotherString {
	public static void main(String[] args) {
		
		String str = "hhellohhellohel";
		String substr = "hello";
		int count = 0;
		
		for (int i = 0; i <= str.length() - substr.length(); i++) {
			boolean isMatch = true;
			for (int j = 0; j < substr.length(); j++) {
				if (str.charAt(i+j) != substr.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			
			 if (isMatch) {  
	                count++;
	            }
		}
		
		if (count > 0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
