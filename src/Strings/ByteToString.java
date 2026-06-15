package Strings;

public class ByteToString {
	public static void main(String[] args) {
		
		byte by[] = {65,66,67,68,69,70};
		
		String s  = "";
		
		for (int i = 0; i < by.length; i++) {
			s = s + (char)by[i];
		}
		
		System.out.println(s); // ABCDEF

	}

}
