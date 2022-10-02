package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10886 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		byte N = in.nextByte();
		
		byte count_1 = 0;
		byte count_0 = 0;
		
		byte input;
		
		for(int i=0; i<N; i++) {
			input = in.nextByte();
			
			if(input == 1)
				count_1 += 1;
			else if(input == 0)
				count_0 += 1;
		}
		
		System.out.println((count_1 > count_0) ? "Junhee is cute!" : "Junhee is not cute!");
	}

}
