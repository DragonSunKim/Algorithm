package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_5063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int r, e, c;
		
		for(int i=0; i<N; i++) {
			r = in.nextInt();
			e = in.nextInt();
			c = in.nextInt();
			
			if(r > e-c)
				System.out.println("do not advertise");
			else if(r == e-c)
				System.out.println("does not matter");
			else if(r < e-c)
				System.out.println("advertise");
		}
	}

}
