package Numbers;

public class SumOfNnatural {
	public static void main(String[] args) {
		
		// n=3   1+2+3
		// n=4  1+2+3+4
		
		int num = 4;
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			sum = sum +i;
		}
		
		System.out.println(sum);
	}
}
