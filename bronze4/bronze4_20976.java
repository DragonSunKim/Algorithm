package bronze4;

import java.util.Scanner;

public class bronze4_20976 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		if(Math.max(A, Math.max(B, C)) == A)
			System.out.println(Math.max(B, C));
		else if(Math.max(A, Math.max(B, C)) == B)
			System.out.println(Math.max(A, C));
		else if(Math.max(A, Math.max(B, C)) == C)
			System.out.println(Math.max(A, B));
	}

}
