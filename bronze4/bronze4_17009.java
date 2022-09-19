package bronze4;

import java.util.Scanner;

public class bronze4_17009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A3 = in.nextInt();
		int A2 = in.nextInt();
		int A1 = in.nextInt();
		
		int B3 = in.nextInt();
		int B2 = in.nextInt();
		int B1 = in.nextInt();
		
		int A_score = (A3*3)+(A2*2)+(A1);
		int B_score = (B3*3)+(B2*2)+(B1);
		
		if(A_score > B_score) {
			System.out.print("A");
		}
		else if(A_score < B_score) {
			System.out.print("B");
		}
		else
			System.out.print("T");
	}

}
