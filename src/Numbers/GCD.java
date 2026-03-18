package Numbers;

public class GCD {
	public static void main(String[] args) {
		
		int n1 = 6, n2 = 12;
		int gcd = 0;
		
		for(int i =1; i<=n1 && i<=n2; i++) {
			gcd = i;
		}
		
		System.out.println("Greatest common divisor is: "+gcd);
		
		int LCM = (n1 * n2)/gcd;
		
		System.out.println("Lowest common divisor is: "+LCM);
	}

}
