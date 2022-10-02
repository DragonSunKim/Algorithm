package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10824 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String A = in.next();
		String B = in.next();
		String C = in.next();
		String D = in.next();
		
		long x = Long.parseLong(A+B);
		long y = Long.parseLong(C+D);
		
		System.out.print(x+y);
	}

}
