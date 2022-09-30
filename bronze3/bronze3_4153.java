package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_4153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x=1;
		int y=1;
		int z=1;
		int x_squared;
		int y_squared;
		int z_squared;
		
		while(true) {
			x = in.nextInt();
			y = in.nextInt();
			z = in.nextInt();
			
			if(x==0 && y==0 && z==0)
				break;
			
			x_squared = x*x;
			y_squared = y*y;
			z_squared = z*z;
			
			if(z_squared == (x_squared + y_squared) || y_squared == (x_squared + z_squared) || x_squared == (y_squared + z_squared))
				System.out.println("right");
			else
				System.out.println("wrong");
		
		}		
	}
}
