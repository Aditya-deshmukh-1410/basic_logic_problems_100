package Numbers;

public class SumOfDigitsUsingRecursion {
	
	public static int SumOFDigits(int num) {
		
		int n = num % 10;
		
		if(n == 0) {
			return 0;
		}
		
		return n + SumOFDigits(num / 10);
		
	}
	
	public static void main(String[] args) {
		System.out.println(SumOFDigits(123));
	}
}
