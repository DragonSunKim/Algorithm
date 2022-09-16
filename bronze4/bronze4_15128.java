package bronze4;

import java.util.Scanner;

public class bronze4_15128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int p1 = in.nextInt();
		int q1 = in.nextInt();
		int p2 = in.nextInt();
		int q2 = in.nextInt();
		
		double p = p1*(double)p2;
		double q = q1*(double)q2*2;
		
		System.out.println((p%q == 0) ? 1: 0);

	}

}
