package Arrays;

public class RepeatingElements {
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,2,4,2};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				continue;
			}
			int count = 0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
				}
			}
			
			if(count > 0) {
				System.out.println("element "+arr[i]+" Repeated "+count+" times");
			}
		}
		
	}
}
