package Strings;

public class StringContainsDigits {
	public static void main(String[] args) {
		
		String str = "123a4";
		boolean isDigit = true;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) >= '0' && str.charAt(i)<= '9') {
				isDigit = true;
			} else {
				isDigit = false;
				break;
			}
		}
		
		if (isDigit) {
			System.out.println("String contains Only digits");
		} else {
			System.out.println("String contains char ");

		}
	}
}
