package Strings;

public class SumOfNoInString {
	public static void main(String[] args) {
		
		// eg:- "a1b2c3" -> sum = 6
		
		String s1 = "a1b2c3";
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) >= '0' && s1.charAt(i)<='9') {
				int num = s1.charAt(i);
				sum = sum + (num - 48);
			}
		}
		System.out.println("sum is:"+ sum);  // 6
	}

}
