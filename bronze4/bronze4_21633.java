package bronze4;

import java.util.Scanner;

public class bronze4_21633 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double k = in.nextDouble();
		
		double charge = 25 + (0.01 * k);
		
		if(charge < 100)
			System.out.println(100);
		else if(charge > 2000)
			System.out.println(2000);
		else
			System.out.println(charge);
	}

}
