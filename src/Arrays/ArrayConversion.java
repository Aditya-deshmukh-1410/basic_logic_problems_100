package Arrays;

import java.util.Arrays;

public class ArrayConversion {
	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int OneD[] = new int[arr.length * arr[0].length];
		int index = 0;
		
		for (int i = 0; i < arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				
				OneD[index] = arr[i][j];
				index++;
			}
		}
		
		System.out.println(Arrays.toString(OneD)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
	}

}
