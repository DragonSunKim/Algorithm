package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int N;
		int C;
		double G;
		
		int C_sum;
		double sum;
		for(int i=0; i<T; i++) {
			N = in.nextInt();
			C_sum =0;
			sum =0;
			for(int j=0; j<N; j++) {
				C = in.nextInt();
				G = in.nextDouble();
				
				C_sum += C;
				sum += (C*G);
			}
			System.out.printf("%d %.1f\n", C_sum, sum/C_sum);
			
		}
	}

}
