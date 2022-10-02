package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a,b,c,d;
		int[] sum = new int[5];
		for(int i=0; i<5; i++) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			d = in.nextInt();
			
			sum[i] = a+b+c+d;
		}
		int max = sum[0];
		int max_num = 1;
		
		for(int i=1; i<5; i++) {
			if(sum[i] > max) {
				max = sum[i];
				max_num = i+1;
			}
		}
		
		System.out.printf("%d %d", max_num, max);
	}

}
