package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_9085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int N;
		int sum;
		for(int j=0; j<T; j++) {
			sum =0;
			N = in.nextInt();
			for(int i=0; i<N; i++) {
				sum += in.nextInt();
			}
			System.out.println(sum);
		}
	}

}
