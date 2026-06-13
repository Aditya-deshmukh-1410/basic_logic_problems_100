package Strings;

public class RepetativeChar {
	public static void main(String[] args) {
		
		String str = "hello world";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				continue;
			}
			
			char current  = ch[i];
			int count = 0;
			
			for (int j = 0; j < ch.length; j++) {
				if (current == ch[j]) {
					count++;
					ch[j] = ' ';
				}
			}
			
			if (count > 1) {
				System.out.println(current + " Repeated "+count+" times");
				/*
					l Repeated 3 times
					o Repeated 2 times
				*/
			}
		}
	}

}
