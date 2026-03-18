package Numbers;

public class PalindromeCheck {
	public static void main(String[] args) { 
		
		int num = 1213;
		int reverse = 0;
		int n = num;
		
		while(num != 0) {
			int rem = num % 10;
			reverse = reverse*10 + rem;
			num = num / 10;
		}
		
		if (n == reverse) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome ");
		}
	}

}
