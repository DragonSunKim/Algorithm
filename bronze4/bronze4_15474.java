package bronze4;

import java.util.Scanner;

public class bronze4_15474 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int set1 = (int)Math.ceil(N/(double)A) * B;
		int set2 = (int)Math.ceil(N/(double)C) * D;
		
		System.out.print((set1 >= set2) ? set2 : set1);
	}

}
