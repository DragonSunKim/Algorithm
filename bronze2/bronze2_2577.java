package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		String s = Integer.toString(A*B*C);
		int sum;
		for(int i=0; i<10; i++) {
			sum =0;
			for(int j=0; j<s.length(); j++) {
				if(s.substring(j,j+1).equals(Integer.toString(i)))
					sum += 1;
			}
			System.out.println(sum);
		}
		
	}

}
