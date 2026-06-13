package Strings;

public class CountOccurences {
	public static void main(String[] args) {
		
		String str = "hello world";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if (ch[i] == ' ') {
				continue;
			}
			
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = ' ';   
				}
			}
			
			System.out.println(ch[i]+" repeated "+ count+" times");
		/*
			h repeated 1 times
			e repeated 1 times
			l repeated 3 times
			o repeated 2 times
			w repeated 1 times
			r repeated 1 times
			d repeated 1 times
		*/
		}
		
		
	}

}
