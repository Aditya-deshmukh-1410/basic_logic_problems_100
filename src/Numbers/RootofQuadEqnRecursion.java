package Numbers;

public class RootofQuadEqnRecursion {
	
	public static double sqrt(double num, double guess) {
		
		double new_guess = (guess + num /guess)/2;
		
		if(new_guess == guess) {
			return new_guess;
		}
		return sqrt(num, new_guess);
	}
	
	public static void main(String[] args) {
		
		int a = 2 ,b = 4, c = 6;
		double r1 =0, r2 = 0;
		double descri = b*b - 4*a*c;
		
		if(descri > 0) {
			
			r1 = (-b + sqrt(descri, descri/2)) / (2*a);
			r2 = (-b - sqrt(descri, descri/2)) / (2*a);
			System.out.println(r1 +" "+r2);
			
		} else if(descri < 0) {
			r1 = r2 = -b/(2 * a);
			System.out.println(r1 +" "+r2);
		} else {
			System.out.println("Root is Imaginary");
		}
	
	}

}
