package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_5565 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x;
		
		int sum = in.nextInt();
		
		for(int i=0; i<9; i++) {
			x = in.nextInt();
			
			sum -= x;
		}
		System.out.print(sum);
	}

}
