package bronze4;

import java.util.Scanner;

public class bronze4_21631 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		long a = in.nextLong();
		long b = in.nextLong();
		
		if(b <= (a+1))
			System.out.println(b);
		else
			System.out.println(a+1);
	}

}
