package bronze4;

import java.util.Scanner;

public class bronze4_20673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int p = in.nextInt();
		int q = in.nextInt();
		
		if(p <= 50 && q <= 10)
			System.out.println("White");
		else if(q > 30)
			System.out.println("Red");
		else
			System.out.println("Yellow");
	}

}
