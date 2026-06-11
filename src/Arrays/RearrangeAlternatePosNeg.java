package Arrays;

import java.util.Arrays;

public class RearrangeAlternatePosNeg {
	public static void main(String[] args) {
		
		int arr[] = {5,-2,6,-4,8,-5};
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				
				index++;
			}
		}
		
		System.out.println(Arrays.toString(arr)); // [-2, -4, -5, 5, 8, 6]
		
		int neg = 1;
		for (int pos = 0; pos < arr.length && neg < arr.length; pos++) {
			
			if (arr[neg] < 0 && arr[pos] > 0) {
				int temp = arr[pos];
				arr[pos] = arr[neg];
				arr[neg] = temp;
				
				neg = neg +2;
			}
			
		}
		
		System.out.println(Arrays.toString(arr)); // [-2, 5, -5, 8, -4, 6]
	}

}
