package Arrays;

public class TargetSumPairs {
	public static void main(String[] args) {
		
		int arr[] = {2,4,3,5,7};
		int target = 7;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				int sum = arr[i] + arr[j];
				
				if (sum == target) {
					System.out.println("Pair: "+arr[i]+ ","+ arr[j]);  // Pair: 2,5 and Pair: 4,3
					
				}
			}
		}
		
	}

}
