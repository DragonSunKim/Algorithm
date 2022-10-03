package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_17496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int T = in.nextInt();
		int C = in.nextInt();
		int P = in.nextInt();
		
		int sum=0;
		int harvest = 1+T;
		for(int i=1; i<=N; i++) {
			if(i == harvest) {
				sum += C;
				harvest += T;
			}
		}
		
		System.out.print(sum*P);
	}

}
