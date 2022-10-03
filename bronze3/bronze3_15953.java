package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_15953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int a,b,sum;
		
		for(int i=0; i<T; i++) {
			sum =0;
			a = in.nextInt();
			b = in.nextInt();
			
			if(a==0 || a >21)
				sum += 0;
			else if(a <= 1)
				sum += 5000000;
			else if(a <= 3)
				sum += 3000000;
			else if(a <= 6)
				sum += 2000000;
			else if(a <= 10)
				sum += 500000;
			else if(a <= 15)
				sum += 300000;
			else if(a <= 21)
				sum += 100000;
			
			if(b==0 || b > 31)
				sum += 0;
			else if(b <= 1)
				sum += 5120000;
			else if(b <= 3)
				sum += 2560000;
			else if(b <= 7)
				sum += 1280000;
			else if(b <= 15)
				sum += 640000;
			else if(b <= 31)
				sum += 320000;
			
			System.out.println(sum);
		}	
	}

}
