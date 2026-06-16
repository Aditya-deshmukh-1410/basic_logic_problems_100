package Strings;

public class PalindromeUsingRecursion {
	
	public static boolean isPalin(String str, int i, int j) {
		if (i>=j) {
			return true;
		}
		  
		if (str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		return isPalin(str, i+1, j-1);
	}
	
	public static void main(String[] args) {
		
		String str = "LeveL";
		System.out.println(isPalin(str, 0, str.length()-1));
	}

}
