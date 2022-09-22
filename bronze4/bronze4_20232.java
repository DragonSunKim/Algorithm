package bronze4;

import java.util.Scanner;

public class bronze4_20232 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int y = in.nextInt();
		
		if(y == 2006)
			System.out.println("PetrSU, ITMO");
		else if(y==1996 || y==1997 || y==2000 || y==2007 || y==2008 || y==2013 || y==2018)
			System.out.println("SPbSU");
		else
			System.out.println("ITMO");
	}

}
