package Numbers;

public class DaysToYears {
	public static void main(String[] args) {
		
		int days = 197;
		
		int years = days / 365;
		
		int remainDays = days % 365;
		
		int weeks = remainDays / 7; 
		
		int day = remainDays % 7;
		
		System.out.println(years);
		System.out.println(weeks);
		System.out.println(day);
				
	}

}
