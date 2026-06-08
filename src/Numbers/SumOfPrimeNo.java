package Numbers;

public class SumOfPrimeNo {
	
	public static Boolean isPrime(int n) {
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		int start = 11 , end = 20;
		int sum =0;
		for(int i = start; i<=end; i++) {
			
			if(isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
	}
}
