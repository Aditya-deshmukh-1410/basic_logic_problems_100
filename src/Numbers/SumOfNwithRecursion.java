package Numbers;

public class SumOfNwithRecursion {

	public static int SumOfN(int num) {
		if(num == 1) {   // base case 
			return 1;
		}
		return num + SumOfN(num - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(SumOfN(5));
	}
	
}
