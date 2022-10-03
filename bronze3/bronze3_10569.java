package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10569 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int V,E;
		
		for(int i=0; i<T; i++) {
			V = in.nextInt();
			E = in.nextInt();
			
			System.out.println(2-V+E);
		}
	}

}
