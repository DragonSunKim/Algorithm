package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_5717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int M, F;
		
		while(true) {
			M = in.nextInt();
			F = in.nextInt();
			
			if(M==0 && F==0)
				break;
			System.out.println(M+F);
		}
	}

}
