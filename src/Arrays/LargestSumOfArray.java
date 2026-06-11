package Arrays;

public class LargestSumOfArray {
	public static void main(String[] args) {
		
		int a1[] = {1,4,3,6};
		int a2[] = {1,5,7,4};
		
		int result1 = 0 , result2 = 0;
		
		for (int i = 0; i < a1.length; i++) {
			result1 = result1 + a1[i];
		}
		
		for (int i = 0; i < a2.length; i++) {
			result2 = result2 + a2[i];
		}  
		
		if (result1 > result2) {
			System.out.println("Array 1 has largest sum: "+result1);
		} else if(result1 < result2) {
			System.out.println("Array 2 has largest sum: "+result2);
		} else {
			System.out.println("Both array's sum are equal ");
		}
	}

}
