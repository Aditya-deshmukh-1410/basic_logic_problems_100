package Arrays;

import java.util.Arrays;

public class MedianOfArray {
	public static void main(String[] args) {
		
		int arr1[] = {1,3,2,4};
		int arr2[] = {5,7,6,8};
		
		int merge[] = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			merge[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			merge[arr1.length + i] = arr2[i];
		}
		
		// bubble sort 
		
		for (int i = 0; i < merge.length; i++) {
			for (int j = 0; j < merge.length -1; j++) {
				if (merge[j] > merge[j+1]) {
					
					int temp = merge[j];
					merge[j] = merge[j+1];
					merge[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(merge));  // [1, 2, 3, 4, 5, 6, 7, 8]
		
		int mid = merge.length / 2;
		System.out.println(mid);  // mid = 4
		
		int median = (merge[mid] + merge[mid -1]) / 2;   // (5+4)/2 = 4
		
		System.out.println(median);
	}
}
