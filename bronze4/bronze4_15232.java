package bronze4;

import java.util.Scanner;

public class bronze4_15232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int R = in.nextInt();
		int C = in.nextInt();
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
