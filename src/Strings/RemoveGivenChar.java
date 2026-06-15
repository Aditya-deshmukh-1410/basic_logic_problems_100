package Strings;

public class RemoveGivenChar {
	public static void main(String[] args) {
		
		String str = "hello";
		char ch[] = str.toCharArray();
		char target = 'e' , replace = ' ';
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == target) {
				ch[i] = replace;
			}
		}
		
		System.out.println(ch); // h llo
	}
}
