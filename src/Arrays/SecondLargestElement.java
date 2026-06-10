package Arrays;

public class SecondLargestElement {
	public static void main(String[] args) {
		
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
