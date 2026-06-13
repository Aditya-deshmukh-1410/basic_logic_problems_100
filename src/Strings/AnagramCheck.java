package Strings;

//what is Anagram ?
// A string is anagram if --> length is equal and new word is formed from same length 
// eg: - ate , eat 


public class AnagramCheck {
	
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
		
		String str1 = "ate" , str2 = "eat";
		
		if (str1.length() == str2.length()) {
			
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			
			bubbleSort(ch1); // aet
			bubbleSort(ch2); // aet
			
			boolean isAna = true;
			
			for (int i = 0; i < ch1.length; i++) {
				if(ch1[i] != ch2[i]) {
					isAna = false;
					break;
				}
			}
			
			if(isAna) {
				System.out.println("Yes its Anagram");
			} else {
				System.out.println("No its not Anagram");
			}
		} else {
			 System.out.println("No its not anagram");
		}
	}

}
