package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double x = in.nextInt();
		double y = in.nextInt();
		
		int N = in.nextInt();
		double min = x *(1000/y);
		for(int i=0; i<N; i++) {
			x = in.nextDouble();
			y = in.nextDouble();
			
			if(min > x*(1000/y))
				min = x*(1000/y);
		}
		System.out.printf("%.2f", min);
	}

}
