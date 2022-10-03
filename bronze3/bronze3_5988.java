package bronze3;

import java.math.BigInteger;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_5988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		BigInteger x;
		for(int i=0; i<N; i++) {
			
			x = new BigInteger(in.next());
			if(x.remainder(BigInteger.TWO).intValue() == 0)
				System.out.println("even");
			else if(x.remainder(BigInteger.TWO).intValue() == 1)
				System.out.println("odd");
			
		}
	}

}
