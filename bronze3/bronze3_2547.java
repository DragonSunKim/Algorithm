package bronze3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		BigInteger sum;
		int N;
		int T = in.nextInt();
		ArrayList<String> array = new ArrayList<>();
		for(int j=0; j<T; j++) {
			in.nextLine();
			sum = BigInteger.ZERO;
			N = in.nextInt();
			for(int i=0; i<N; i++) {
				sum = sum.add(new BigInteger(in.next()));
			}
			
			if(sum.remainder(BigInteger.valueOf(N)).compareTo(BigInteger.ZERO) == 0)
				array.add("YES");
			else
				array.add("NO");
		}
		for(int k=0; k<array.size(); k++)
			System.out.println(array.get(k));
	}

}
