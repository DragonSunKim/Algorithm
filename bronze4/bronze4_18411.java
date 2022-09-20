package bronze4;

import java.util.Scanner;

public class bronze4_18411 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
//		if(A == B && B == C)
//			System.out.println(A*2);
//		else if(A == B && B != C)
//			System.out.println();
		
		if(Math.max(A, Math.max(B, C)) == A) {
			if(Math.max(B, C) == B)
				System.out.println(A+B);
			else if(Math.max(B, C) == C)
				System.out.println(A+C);
		}
		else if(Math.max(A, Math.max(B, C)) == B) {
			if(Math.max(A, C) == A)
				System.out.println(A+B);
			else if(Math.max(A, C) == C)
				System.out.println(B+C);
		}
		else if(Math.max(A, Math.max(B, C)) == C) {
			if(Math.max(A, B) == A)
				System.out.println(A+C);
			else if(Math.max(A, B) == B)
				System.out.println(B+C);
		}
	}

}
