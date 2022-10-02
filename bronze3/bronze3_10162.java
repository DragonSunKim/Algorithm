package bronze3;

import java.util.Scanner;

// Coding By 김용선

public class bronze3_10162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int z = (T%10 == 0) ? 1 : 0;
		
		int A = T/300;
		T = T - (300*A);
		int B = T /60;
		T = T -(60*B);
		int C = T / 10;
		
		
		if(z == 1)
			System.out.printf("%d %d %d", A, B, C);
		else if(z == 0)
			System.out.println(-1);
	}

}
