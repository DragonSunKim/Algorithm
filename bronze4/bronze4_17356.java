package bronze4;

import java.util.Scanner;

public class bronze4_17356 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		double M = (B-A)/400;
		
		double ans = 1 / (1+Math.pow(10, M));
		
		System.out.print(ans);
	}

}
