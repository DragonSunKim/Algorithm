package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		String s;
		int sum;
		for(int i=0; i<T; i++) {
			
			s = in.next();
			
			sum = Integer.parseInt(s.split(",")[0]) +  Integer.parseInt(s.split(",")[1]);
			
			System.out.println(sum);
		}
	}

}
