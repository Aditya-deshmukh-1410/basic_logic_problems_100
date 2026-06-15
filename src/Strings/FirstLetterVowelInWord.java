package Strings;

public class FirstLetterVowelInWord {
	public static void main(String[] args) {
		
		String str = "an apple a day";
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {  
			
			if (i == 0) {
				if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					count++;
				}
			}
			
			if (str.charAt(i)==' ') {
				if (str.charAt(i+1)=='a' || str.charAt(i+1)=='e' || str.charAt(i+1)=='i' || str.charAt(i+1)=='o' || str.charAt(i+1)=='u') {
					count++;
				}
			}
		}
		
		System.out.println(count); // 3 vowels in start of word
	}

}
