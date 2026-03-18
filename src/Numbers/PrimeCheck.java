package Numbers;

public class PrimeCheck {
	public static void main(String[] args) {
		
		int num =13;
		Boolean isPrime = true;
		
		for(int i = 2; i<num; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if (isPrime) {
			System.out.println(num+" is Prime No.");
		} else {
			System.out.println(num+" is not Prime No.");
		}
		
	}
}
