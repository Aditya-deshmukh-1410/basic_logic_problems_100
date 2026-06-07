package Numbers;

import java.util.Scanner;

public class DecimalToOctal {
	
	// Octal nos -> {0,1,2,3,4,5,6,7} eg : 341,225,107 are octal nos.
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String octal = "";
		
		while(num != 0) {
			int n = num % 8;
			octal = n + octal;
			num = num / 8;
		}
		
		System.out.println("Octal no is : "+octal);
	}

}
