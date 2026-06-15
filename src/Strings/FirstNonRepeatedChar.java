package Strings;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		
		String str = "hello";
		char ch[] = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}  
			}
			
			if (count == 1) {
				System.out.println("first non repeated char is "+ch[i]+" repeated "+count+" time");
				break;
			}
		}
		
		
	}

}
