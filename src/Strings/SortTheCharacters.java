package Strings;

public class SortTheCharacters {
	
	public static void bubbleSort(char ch[]) {
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j+1]) {
					
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
					
				}
			}	
		}
	}
	
	public static void main(String[] args) {
		
		String str = "hello";
		char ch[] = str.toCharArray();
		
		bubbleSort(ch);
		
		System.out.println(ch);
	}

}
