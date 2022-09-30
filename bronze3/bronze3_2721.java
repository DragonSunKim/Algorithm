package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int n;
		int sum;
		int total;
		for(int i=0; i<T; i++) {
			total =0;
			n = in.nextInt();
			
			for(int j=1; j<=n; j++) {
				sum =0;
				for(int k=1; k<=j+1; k++) {
					sum += k;
				}
				sum *= j;
				total += sum;
			}
			System.out.println(total);
		}
	}

}
