package bronze4;

import java.util.Scanner;

public class bronze4_17362 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long n = in.nextLong();
		
		long ans = n%8;
		
		if(ans == 1)
			System.out.print(1);
		else if(ans == 2 || ans == 0)
			System.out.print(2);
		else if(ans == 3 || ans == 7)
			System.out.print(3);
		else if(ans == 4 || ans == 6)
			System.out.print(4);
		else if(ans == 5)
			System.out.print(5);
	}

}
