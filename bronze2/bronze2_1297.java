package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1297 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int D = in.nextInt();
		int H = in.nextInt();
		int W = in.nextInt();
		
		double x = Math.sqrt(Math.pow(D, 2)/(Math.pow(H,2)+Math.pow(W,2)));
		
		int h = (int)Math.floor(x*H);
		int w = (int)Math.floor(x*W);
		
		System.out.print(h +" " + w);
	}

}
