package Numbers;

public class AutomorphicCheck {
	
	//automorphic - >  no. whose square ends with same number eg 5^2 = 25
	
	public static void main(String[] args) {
		
		int num = 5;
		if((num * num)%10 == num) {
			System.out.println(" Yes ,It's Automorphic ");
		} else {
			System.out.println(" No ,It's not Automophic ");
		}
	}
}
