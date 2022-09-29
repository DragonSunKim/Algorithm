package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2566 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int max = -1 ;
		int row=0;
		int col=0;
		int x;
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				x = in.nextInt();
				
				if(x > max) {
					max = x;
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.printf("%d %d", row, col);
	}

}
