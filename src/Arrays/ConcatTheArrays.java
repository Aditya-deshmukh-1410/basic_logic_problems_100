package Arrays;

public class ConcatTheArrays {
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int arr3[] = new int[6];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);  // 123456
		}
	}

}
