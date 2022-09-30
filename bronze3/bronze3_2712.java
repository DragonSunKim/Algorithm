package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		double x;
		String y;
		for(int i=0; i<T; i++) {
			x = in.nextDouble();
			y = in.next();
			
			if(y.equals("kg"))
				System.out.printf("%.4f %s\n", x*2.2046, "lb");
			else if(y.equals("lb"))
				System.out.printf("%.4f %s\n", x*0.4536, "kg");
			else if(y.equals("l"))
				System.out.printf("%.4f %s\n", x*0.2642, "g");
			else if(y.equals("g"))
				System.out.printf("%.4f %s\n", x*3.7854, "l");
			
		}
	}

}
