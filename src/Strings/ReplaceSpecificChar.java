package Strings;

public class ReplaceSpecificChar {
	public static void main(String[] args) {
		
		String str = "hello";
		char change = 'e', target = 'x';
		
		char ch[] = str.toCharArray();  
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == change) {
				ch[i] = target;
			}
		}
		
		System.out.println(ch); // hxllo
	}

}
