package Arrays;

public class MaxMinElement {
	public static void main(String[] args) {
		
		int arr[][] = {{3,2,1},{4,6,5},{7,9,8}};
		
		int max = arr[0][0] , min = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		
		System.out.println(min+" and "+max);
		
	}

}
