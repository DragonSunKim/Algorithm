package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_3034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int W = in.nextInt();
		int H = in.nextInt();
		
		int x;
		for(int i=0; i<N; i++) {
			x = in.nextInt();
			if(Math.pow(x,2) <= Math.pow(W,2) + Math.pow(H, 2))
				System.out.println("DA");
			else
				System.out.println("NE");
		}
	}

}
