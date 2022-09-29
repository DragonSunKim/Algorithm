package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int C_hour = C / 60;
		int C_minute = C % 60;
		
		A = (A + C_hour + ((B+C_minute)/60)) % 24;
		B = (B + C_minute) % 60;
		
		System.out.printf("%d %d", A, B);
	}

}
