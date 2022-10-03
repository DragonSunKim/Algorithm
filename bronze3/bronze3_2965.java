package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2965 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int x = B-A-1;
		int y = C-B-1;
		
		if(x > y)
			System.out.println(x);
		else if(x < y)
			System.out.println(y);
		else if(x == y)
			System.out.println(x);
	}

}
