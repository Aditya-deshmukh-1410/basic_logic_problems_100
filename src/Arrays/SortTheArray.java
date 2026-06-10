package Arrays;

import java.util.Arrays;

public class SortTheArray {
	public static void main(String[] args) {
		
		int arr[] = {2,1,4,5,6};
		
		System.out.println("Before sorting "+Arrays.toString(arr));
		
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		System.out.println("After Sorting"+Arrays.toString(arr));
	}
}
