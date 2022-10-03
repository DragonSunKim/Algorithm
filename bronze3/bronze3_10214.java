package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10214 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int y,k;
		int y_sum;
		int k_sum;
		
		for(int i=0; i<T; i++) {
			y_sum = 0;
			k_sum = 0;
			for(int j=0; j<9; j++) {
				y = in.nextInt();
				k = in.nextInt();
				
				y_sum += y;
				k_sum += k;
			}
			System.out.println((y_sum > k_sum) ? "Yonsei" : (y_sum < k_sum) ? "Korea" : "Draw");
		}
	}

}
