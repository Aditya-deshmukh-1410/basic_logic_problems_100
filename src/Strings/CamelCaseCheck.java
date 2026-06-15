package Strings;

public class CamelCaseCheck {
	public static void main(String[] args) {
		
		String str = "woRld";
		
		if (str.charAt(0) >= 'a' && str.charAt(0) <='z') {
			
			boolean isCamel = false;
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					isCamel = true;
					break;
				}
			}
			System.out.println(isCamel);
		} else {
			System.out.println("not camelCase");
		}
	}

}
