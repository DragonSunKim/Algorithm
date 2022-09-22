package bronze4;

import java.util.Scanner;

public class bronze4_20352 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		
		a = a/(Math.PI);
		
		double r = Math.sqrt(a);
		
		double result = 2 * Math.PI * r;
		
		System.out.println(result);
	}

}
