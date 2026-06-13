package Strings;

public class FindAsciiValues {
	public static void main(String[] args) {
		
		String str = "ADITYA";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' || ch[i] <= 'z') {
				int num = ch[i];
				char c = (char) (num + 32);
				System.out.print(c);  // aditya
			}
		}
		
		
	}

}
