package Arrays;

import java.util.Arrays;

public class DivideAnArray {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6};
		
		int mid = arr1.length / 2;
		
		int arr2[] = new int[mid];
		int arr3[] = new int[arr1.length - mid];
		
		for (int i = 0; i < mid; i++) {
			arr2[i] = arr1[i];
		}
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[mid + i];
		}
		
		System.out.println(Arrays.toString(arr1));  // [1, 2, 3, 4, 5, 6]
		System.out.println(Arrays.toString(arr2));  // [1, 2, 3]
		System.out.println(Arrays.toString(arr3));  // [4, 5, 6]

	}

}
