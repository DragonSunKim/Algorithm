package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_5086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x,y;
		
		while(true) {
			x = in.nextInt();
			y = in.nextInt();
			
			if(x==0 && y==0)
				break;
			
			if(y%x == 0)
				System.out.println("factor");
			else if(x%y == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}
	}

}
