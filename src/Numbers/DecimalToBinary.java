package Numbers;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		
		System.out.print("Enter the number to convert Decimal to Binary :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String Binary = "";
		
		while(num!=0) {
			
			int n = num % 2;
			Binary = n + Binary ;
			num = num / 2;	
		}
		
		System.out.println("Binary conversion is :"+Binary);
	}

}
