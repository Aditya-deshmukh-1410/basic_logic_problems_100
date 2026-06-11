package Arrays;

import java.util.Arrays;

public class LeftRoationOfArray {
	public static void main(String[] args) {
		
		/* Q: Left rotate an array by d positions
         Approach: For each rotation, save first element in temp,
         shift all elements one step left, place temp at last index

         {1,2,3,4,5} → d=2 → {3,4,5,1,2}
         
         [1,2,3,4,5] --> temp=1 --> [ _ ,2,3,4,5] --> [2,3,4,5,_] --> [2,3,4,5,1]
		
		 */ 
		
		int arr[] = {1,2,3,4,5};
		
		int d=2; // no. of times to be rotated 
		for (int j = 0; j < d; j++) {
			
			int temp = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				    arr[i]  = arr[i+1];
			}
			  arr[arr.length-1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));  // [3, 4, 5, 1, 2]
	}

}
