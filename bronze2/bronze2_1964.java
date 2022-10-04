package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		long sum=0;
		int c=10;
		if(N == 1)
			System.out.println(5);
		else if(N == 2)
			System.out.println(12);
		else {
			sum = 12;
			for(int i=3; i<=N; i++) {
				sum += c;
				c += 3;
			}
			System.out.println(sum%45678);	
		}

	}

}
