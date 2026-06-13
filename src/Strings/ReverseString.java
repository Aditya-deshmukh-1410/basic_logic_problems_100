package Strings;

public class ReverseString {
	
	public static void reverseString(char ch[],int i,int j) {
		
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		
		String str = "hello world";
		char ch[] = str.toCharArray();
		
		reverseString(ch,0,ch.length-1);
		System.out.println(ch);
		
	}

}
