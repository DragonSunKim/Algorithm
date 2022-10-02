package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_22279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		double q;
		double y;
		double sum = 0;
		for(int i=0; i<N; i++) {
			
			q = in.nextDouble();
			y = in.nextDouble();
			
			sum = sum + q*y;
			
		}
		System.out.printf("%.3f", sum);
	}

}
