package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int max = in.nextInt();
		int num = 1;
		int x;
		
		for(int i=1; i<9; i++) {
			x = in.nextInt();
			
			if(x > max) {
				max = x;
				num = i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
		
	}

}
