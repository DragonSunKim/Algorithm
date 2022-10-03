package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10990 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int k = 1;

		for(int i=N; i<=(2*N-1); i++) {

			
				for(int j=0; j<i; j++) {
					if(j < N-k)
						System.out.print(" ");
					else if(j == N-k)
						System.out.print("*");
					else if(j == i-1)
						System.out.print("*");
					else
						System.out.print(" ");
				
			}

			System.out.println();
			k++;
		}
	}
}