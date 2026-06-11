package Arrays;

import java.util.Arrays;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		
		int arr[] = {1,2,1,3,4,1,5};
		System.out.println("Before Removing duplicates:"+Arrays.toString(arr)); // [1, 2, 1, 3, 4, 1, 5]

		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == 0) {
				continue;
			}
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		
		System.out.println("After Removing duplicates:"+Arrays.toString(arr)); // [1, 2, 0, 3, 4, 0, 5]
	}

}
