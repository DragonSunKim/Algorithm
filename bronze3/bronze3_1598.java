package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_1598 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		double x_dif = Math.abs(Math.ceil(b/4) - Math.ceil(a/4));
		double y_dif = Math.abs(((b%4)==0 ? 4 : b%4)-((a%4) == 0 ? 4: a%4 ));
		
		double d_sum = x_dif + y_dif;
		
		int sum = (int) d_sum;
		System.out.println(sum);
	}

}
