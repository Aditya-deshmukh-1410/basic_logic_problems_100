package Strings;

public class ReverseTheOrder {
	
	public static void reverse(char ch[], int i, int j) {
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
			i++;
			j--;
		}	
	}
	
	public static void main(String[] args) {
		
		String str = "hello hello world";
		char ch[] = str.toCharArray();
		
		reverse(ch, 0, ch.length-1);
		System.out.println(ch); // dlrow olleh olleh
		
		int i = 0;
		for (int j = 0; j < ch.length; j++) {
			if (ch[j] == ' ') {
				reverse(ch, i, j-1);
				i = j+1;
			}
			
			if(j == ch.length-1) {
				reverse(ch, i, j);
			}
		}
		System.out.println(ch); // world hello hello

	}
}
