package bronze4;

import java.util.Scanner;

public class bronze4_18408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int count_1 = 0;
		int count_2 = 0;
		
		if(A == 1)
			count_1 += 1;
		else if(A == 2)
			count_2 += 1;
		
		if(B == 1)
			count_1 += 1;
		else if(B == 2)
			count_2 += 1;
		
		if(C == 1)
			count_1 += 1;
		else if(C == 2)
			count_2 += 1;
		
		System.out.println((count_1 > count_2) ? 1 : 2);
	}

}
