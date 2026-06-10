package Arrays;

public class AvgOfNumbers {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		//avg = sum/total;
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i]; 
		}
		
		int avg = sum / arr.length;
		
		System.out.println(avg);
				
				
	}

}
