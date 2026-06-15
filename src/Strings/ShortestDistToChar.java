package Strings;

public class ShortestDistToChar {
	public static void main(String[] args) {
		
		String str = "hello world";
		char target = 'l';   
		int lcount = 0 , rcount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				lcount ++;
				break;
			}
		}
		
		for (int i = str.length()-1; i >=0; i--) {
			if (str.charAt(i) == target) {
				rcount ++;
				break;
			}
		}
		
		if (lcount > rcount) {
			System.out.println("shortest distance till target is: "+rcount);
		} else {
			System.out.println("shortest distance till target is: "+lcount);

		}
		
		
		
	}
}
