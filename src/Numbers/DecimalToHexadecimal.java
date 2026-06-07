package Numbers;

import java.util.Scanner;

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		 
		// hexadecimal nos. -> 16 numbers [0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F]
		
		char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String hexa = "";
		
		while(num!=0) {
			int n = num % 16;
			hexa  = ch[n] + hexa;
			num = num / 16;
		}
		  
		System.out.println("HexaDecimal number is :"+hexa);
	}

}
