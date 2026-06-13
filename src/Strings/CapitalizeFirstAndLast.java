package Strings;

public class CapitalizeFirstAndLast {
	public static char Upper(char ch) {
		
		if (ch >= 'a' && ch <= 'z') {
			int num = ch;
			ch = (char) (num -32);
		}
		return ch;
	}
	
	public static void main(String[] args) {
		
		String str = "hello world";
		char ch[] = str.toCharArray();
		System.out.println(ch); // hello world
		
		for (int i = 0; i < ch.length; i++) {
			if(i == 0 || i == ch.length-1) {
				ch[i] = Upper(ch[i]);
			}
			
			if (ch[i] == ' ') {
				ch[i+1] = Upper(ch[i+1]);
				ch[i-1] = Upper(ch[i-1]);
			}	
		}	
		System.out.println(ch); // HellO WorlD
	}
}
