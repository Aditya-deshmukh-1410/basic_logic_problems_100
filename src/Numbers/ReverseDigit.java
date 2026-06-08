package Numbers;

public class ReverseDigit {
	public static void main(String[] args) {
		
		int num = 12345;
		int reverse = 0; // without string
		
		while(num != 0) {
			
			int n = num % 10;
			reverse = reverse * 10 + n;
			num = num / 10;

		}
		System.out.println(reverse); //54321
	}

}
