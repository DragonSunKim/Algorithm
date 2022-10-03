package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10995 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i=1; i<=N; i++) {
			if(i%2 == 1) {
				for(int j=1; j<=2*N-1; j++) {
					if(j%2 == 1)
						System.out.print("*");
					else if(j%2 == 0)
						System.out.print(" ");
				}
			}
			else if(i%2 == 0) {
				for(int k=1; k<=2*N; k++) {
					if(k%2 == 1)
						System.out.print(" ");
					else if(k%2 == 0)
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
