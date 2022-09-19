package bronze4;

import java.util.Scanner;

public class bronze4_17388 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int S = in.nextInt();
		int K = in.nextInt();
		int H = in.nextInt();
		
		int total = S+K+H;
		
		if(total >= 100)
			System.out.print("OK");
		else {
			if(Math.min(S, Math.min(K,H)) == S)
				System.out.print("Soongsil");
			else if(Math.min(S, Math.min(K,H)) == K)
				System.out.print("Korea");
			else if(Math.min(S, Math.min(K,H)) == H)
				System.out.print("Hanyang");
		}
	}

}
