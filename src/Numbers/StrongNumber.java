package Numbers;

public class StrongNumber {
	
	public static int fact(int n) {
		 int result = 1;
		 
		for(int i = n; i>0 ; i--) {
			result*=i;
		}
		return result;
	}   
	
	public static void main(String[] args) {
		
		int num = 145;
		int sum = 0;
		int og = num;
		
		while(num != 0) {
			int n = num % 10;
			sum = fact(n) + sum;
			num = num / 10;
			
		}
		
		if(og == sum) {
			System.out.println("Its Strong no");
		} else {
			System.out.println("not a strong no.");
		}
	}
}
