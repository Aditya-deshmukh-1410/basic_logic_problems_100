package Numbers;

public class SumOfNum {
	public static void main(String[] args) {
		
		int num = 123, sum = 0;
		
		while(num != 0) {
			int result = num % 10;
			sum = result + sum;
			num = num / 10;
		}
		System.out.println(sum);
	}

}
