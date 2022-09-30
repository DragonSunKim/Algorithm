package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int C;
		int Quarter;
		int Dime;
		int Nickel;
		int Penny;
		for(int i=0; i<T; i++) {
			C = in.nextInt();
			Quarter = C /25; C = C%25;
			Dime = C / 10; C = C%10;
			Nickel = C / 5; C = C%5;
			Penny = C;
			
			System.out.println(Quarter+" "+Dime+" "+Nickel+" "+Penny);
		}
	}

}
