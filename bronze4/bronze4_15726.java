package bronze4;

import java.util.Scanner;

public class bronze4_15726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		double C = in.nextDouble();
		
		double result1 = A*B/C;
		double result2 = A/B*C;
		
		if(result1 >= result2) {
			System.out.print((int)Math.floor(result1));
		}
		else{
			System.out.print((int)Math.floor(result2));
		}
	}

}
