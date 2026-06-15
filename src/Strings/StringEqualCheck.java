package Strings;

public class StringEqualCheck {
	
	// 2 strings are equal -> 1) length is equal . 2) index element are equal
	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = "hxllo";
		
		char ch[] = str.toCharArray();
		char ch2[] = str2.toCharArray();
		boolean isEqual = true;
		if (ch.length == ch2.length) {
			for (int i = 0; i < ch.length; i++) {
					if (ch[i] != ch2[i]) {
						isEqual = false;
						break;
					}
			}
		} else {
			isEqual = false;
		}
		 
		if (isEqual) {
			System.out.println("Strings are Equal");
		} else {
			System.out.println("Strings are not Equal");
		}
		// output: Strings are not Equal

		
	}

}
