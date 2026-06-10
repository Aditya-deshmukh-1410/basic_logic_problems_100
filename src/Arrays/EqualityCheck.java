package Arrays;

public class EqualityCheck {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {1,2,3,4,5,7};
		
		boolean flag = true;
		
		if(arr1.length != arr2.length) {
			flag = false;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				flag = false;
				break;
			}
			
		}
		
		if (flag) {
			System.out.println("Equality Check Passed!");
		} else {
			System.out.println("Equality check failed!");
		}
		
		//Output: Equality check failed!
		
	}
}
