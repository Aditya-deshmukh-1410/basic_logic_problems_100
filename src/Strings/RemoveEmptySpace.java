package Strings;

import java.util.Iterator;

public class RemoveEmptySpace {
	public static void main(String[] args) {
		
		String str = "hello world";
		String str2 = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				str2 = str2 + str.charAt(i);
			}
		}
		
		System.out.println(str2); // helloworld
	}

}
