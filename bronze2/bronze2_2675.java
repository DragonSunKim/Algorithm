package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int R;
		String S;
		for(int i=0; i<T; i++) {
			R = in.nextInt();
			S = in.next();
			
			for(int j=0; j<S.length(); j++) {
				System.out.print(S.substring(j,j+1).repeat(R));
			}
			System.out.println();
		}
	}

}
