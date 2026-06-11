package Arrays;
import java.util.Arrays;

public class HalfAscHalfDesc {
	public static void main(String[] args) {
		
		int arr[] = {5,2,8,1,9,3};
		
		int mid = arr.length / 2;
		
		for (int i = 0; i < mid; i++) {
			for (int j = 0; j < mid - 1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		
		for (int i = mid; i < arr.length; i++) {
			for (int j = mid; j < arr.length -1; j++) {
				
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		
		System.out.println(Arrays.toString(arr)); // [2, 5, 8, 9, 3, 1]
	}
}
