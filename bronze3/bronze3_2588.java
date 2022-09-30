package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2588 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String x = in.next();
		String y = in.next();
		
		int a = Integer.parseInt(x) * Integer.parseInt(y.substring(2));
		int b = Integer.parseInt(x) * Integer.parseInt(y.substring(1,2));
		int c = Integer.parseInt(x) * Integer.parseInt(y.substring(0,1));
		int d = Integer.parseInt(x) * Integer.parseInt(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
