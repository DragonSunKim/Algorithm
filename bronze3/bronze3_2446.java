package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2446 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<2*N-1-i; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=N-2; i>=0; i--) {
			for(int j=0; j<2*N-i-1; j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
