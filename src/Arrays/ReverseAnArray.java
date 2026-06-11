package Arrays;

public class ReverseAnArray {
	public static void main(String[] args) {
		
		// Approach: Two pointer — swap start & end, move both inward until they meet
		int arr[] = {1,2,3,4,5};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		// Output: 5 4 3 2 1
	}

}
