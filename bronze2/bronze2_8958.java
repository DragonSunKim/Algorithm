package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		String s;
		int count;
		int sum;
		for(int i=0; i<T; i++) {
			s = in.next();
			count =1;
			sum =0;
			for(int j=0; j<s.length(); j++) {
				if(s.substring(j, j+1).equals("O")) {
					sum += count;
					count += 1;
				}
				else if(s.substring(j, j+1).equals("X")) {
					count = 1;
				}
			}
			System.out.println(sum);
		}
	}

}
