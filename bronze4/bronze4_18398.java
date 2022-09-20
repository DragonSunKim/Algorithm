package bronze4;

import java.util.Scanner;

public class bronze4_18398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int N;
		long A,B;
		
		for(int i=0; i<T; i++) {
			N = in.nextInt();
			
			for(int j=0; j<N; j++) {
				A = in.nextLong();
				B = in.nextLong();
				
				System.out.printf("%d %d\n", A+B, A*B);
			}
		}
	}

}
