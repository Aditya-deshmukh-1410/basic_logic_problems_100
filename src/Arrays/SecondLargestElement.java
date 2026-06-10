package Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {

		// Q: Find the 2nd largest element in an array
		
		// Approach: Track two variables - largest & secondLargest
		// Whenever a new largest is found,
		// old largest becomes the 2nd largest
		
		// Note: Integer.MIN_VALUE avoids wrong results for negative numbers
		// Note: arr[i] != largest handles duplicate values ex: {5,5,3} → 2nd largest = 3 not 5
		
		int arr[]= {4,1,2,5,5,3};
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(largest < arr[i]) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("2nd Largest No. is: "+secondLargest);
	}

}
