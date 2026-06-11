package Arrays;

import java.util.Arrays;

public class ZeroAtEnd {
	public static void main(String[] args) {
		 
		int arr[] = {0,1,2,0,3,0,4};
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				
				index++;
			}
		}
		
		System.out.println(Arrays.toString(arr)); // [0, 0, 0, 1, 3, 2, 4]
	}

}
