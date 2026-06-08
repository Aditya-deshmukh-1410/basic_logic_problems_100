package Numbers;

public class Replace0with1 {
	public static void main(String[] args) {
		
		//eg : 20504 -> 21514
		
		int num = 20504;
		int reverse = 0;
		
		System.out.println("Before: "+num); // 20504
		
		while(num!=0) {
			int n = num % 10;
			
			if(n == 0) {
				n = 1;
			}
			reverse = reverse * 10 + n;
			
			num = num / 10;
		}
		
		System.out.println(reverse); // 41512
		
		int original = 0;
		while(reverse != 0) {
			 int n = reverse % 10;
			 original  = original * 10 + n;
			 reverse = reverse / 10;
		}
		
		System.out.println("After: "+original);// 21514
		
	}
}
