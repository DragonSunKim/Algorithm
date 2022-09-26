package bronze3;

import java.util.Scanner;

// Coding By 김용선

public class bronze3_1284 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String N;
		int sum;
		while(true) {
			N = in.next();
			if(N.equals("0"))
				break;
			sum = 2;
			for(int i=0; i<N.length(); i++) {
				if(N.substring(i,i+1).equals("1"))
					sum += 2;
				else if(N.substring(i, i+1).equals("0"))
					sum += 4;
				else
					sum += 3;
			}
			
			sum += (N.length() -1);
			System.out.println(sum);
		}
	}

}
