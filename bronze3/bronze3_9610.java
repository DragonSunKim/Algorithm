package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_9610 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int x,y;
		
		int Q1 = 0;
		int Q2 = 0;
		int Q3 = 0;
		int Q4 = 0;
		int AXIS = 0;
		
		for(int i=0; i<n; i++) {
			x = in.nextInt();
			y = in.nextInt();
			
			if(x == 0 || y == 0)
				AXIS += 1;
			else if(x > 0 && y > 0)
				Q1 += 1;
			else if(x < 0 && y > 0)
				Q2 += 1;
			else if(x < 0 && y < 0)
				Q3 += 1;
			else if(x > 0 && y < 0)
				Q4 += 1;
		}
		System.out.println("Q1: "+Q1);
		System.out.println("Q2: "+Q2);
		System.out.println("Q3: "+Q3);
		System.out.println("Q4: "+Q4);
		System.out.println("AXIS: "+AXIS);
	}

}
