package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int V = in.nextInt();
		String s = in.next();
		
		int A_sum = 0;
		int B_sum = 0;
		
		for(int i=0; i<V; i++) {
			if(s.substring(i,i+1).equals("A"))
				A_sum += 1;
			else if(s.substring(i, i+1).equals("B"))
				B_sum += 1;
		}
		
		if(A_sum > B_sum)
			System.out.print("A");
		else if(A_sum < B_sum)
			System.out.print("B");
		else if(A_sum == B_sum)
			System.out.print("Tie");
	}

}
