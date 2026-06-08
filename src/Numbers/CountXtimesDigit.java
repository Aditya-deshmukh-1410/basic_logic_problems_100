package Numbers;

import java.util.Scanner;

public class CountXtimesDigit {
	public static void main(String[] args) {
		
		System.out.print("Enter no. to check the count: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num = 21252;
		int count = 0;
		
		while(num!=0) {
			int rem = num % 10;
			
			if(rem == n) {
				count ++;
			}
			
			num = num / 10;
		}
		
		System.out.println(n+" Repeated "+count+" times");
	}

}
