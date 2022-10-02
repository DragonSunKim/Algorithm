package bronze3;

import java.math.BigInteger;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		BigInteger A = new BigInteger(in.next());
		String sign = in.next();
		BigInteger B = new BigInteger(in.next());
		
		if(sign.equals("+"))
			System.out.println(A.add(B));
		else if(sign.equals("*"))
			System.out.println(A.multiply(B));
		
	}

}
