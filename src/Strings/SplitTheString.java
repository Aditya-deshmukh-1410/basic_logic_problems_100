package Strings;

public class SplitTheString {
	public static void main(String[] args) {
		
		String str = "hello hello world";
		String split = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' || i == str.length()-1) {
				split = split + str.charAt(i);
			} else{
				System.out.println(split);
				split = "";
			}
		}
		
		System.out.println(split);
	}

}
