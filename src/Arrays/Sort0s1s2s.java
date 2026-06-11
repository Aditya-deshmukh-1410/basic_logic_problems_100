package Arrays;

import java.util.Arrays;

public class Sort0s1s2s {
	public static void main(String[] args) {
		
		int arr[] = {0,1,2,0,1,2,0,1,2};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
