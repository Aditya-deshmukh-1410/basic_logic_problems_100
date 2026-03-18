package Numbers;

public class ArmstrongCheck {
	public static void main(String[] args) {
		
		int num = 370;
		int sum = 0, n = num;
		
		while(num != 0) {
			int rem = num % 10;
			sum = (rem*rem*rem) + sum;
			num = num / 10;
		}
		
		if(n == sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong No.");
		}
		
	}

}
