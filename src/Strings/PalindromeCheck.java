package Strings;

public class PalindromeCheck {
	public static void main(String[] args) {
		
		String str = "LeveL";
		
		int i = 0, j = str.length()-1;
		boolean isPalin = true;
		while(i<j) {
			if (str.charAt(i) != str.charAt(j)) {
				isPalin = false;
				break;
			}
			i++;
			j--;
		}
		
		System.out.println(isPalin);
	}
}
