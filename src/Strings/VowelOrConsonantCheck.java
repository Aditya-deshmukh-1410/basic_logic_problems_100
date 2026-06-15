package Strings;

public class VowelOrConsonantCheck {
	public static void main(String[] args) {
		
		char c = '@';
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
			c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) {
			System.out.println("its vowel");
		} else if(c >= 'a'&& c<= 'z' || c >= 'A'&& c<= 'Z') {
			System.out.println("consonant"); 
		}else {
			System.out.println("not vowel nor Consonant");
		}
		 //output :- not vowel nor Consonant
	}

}
