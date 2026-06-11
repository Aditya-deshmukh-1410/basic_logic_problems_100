package Arrays;

import java.util.Arrays;

public class MoveNegativeElements {
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
	}
}
