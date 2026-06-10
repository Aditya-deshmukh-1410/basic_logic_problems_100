package Arrays;

public class LargestElementOfArray {
	public static void main(String[] args) {
		
		int arr[] = {4,1,2,5,3};
		int largest = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		
		System.out.println("Largest element is:"+ largest);
	}

}
