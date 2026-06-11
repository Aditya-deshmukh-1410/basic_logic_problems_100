package Arrays;

import java.util.Arrays;

public class RightRotationOfArray {
	public static void main(String[] args) {
		
		/*
		  Q: Right rotate an array by d positions
          Approach: For each rotation, save last element in temp,
          shift all elements one step right, place temp at index 0
          
          [1,2,3,4,5,6] --> temp=6 --> [1,2,3,4,5,_] --> [_,1,2,3,4,5] --> [6,1,2,3,4,5]

            {1,2,3,4,5,6} → d=2 → {5,6,1,2,3,4}
		  */
		
		
		int arr[] = {1,2,3,4,5,6};
		
		int d=2;
		for (int j = 0; j < d; j++) {
			
			int temp = arr[arr.length-1];
			
			for (int i = arr.length-2; i >= 0 ; i--) {
				
				   arr[i+1] = arr[i];
			}
			arr[0] = temp; 
		}
		
		System.out.println(Arrays.toString(arr));  // [5, 6, 1, 2, 3, 4] 
	}

}
