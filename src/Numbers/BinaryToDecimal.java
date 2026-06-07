package Numbers;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int Power(int base, int power) {
		
		int result = 1;
		 for(int i = 1; i<=power ; i++) {
			 result = result * base;
		 }
		 return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter number for decimal to binary conversion: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		int decimal = 0;
		int i = 0;
		
		while(num != 0) {
			int rem = num % 10;
			decimal = decimal + rem * Power(2,i);
			num = num / 10;
			i++;
		}
		
		System.out.println(decimal);
	}

}
