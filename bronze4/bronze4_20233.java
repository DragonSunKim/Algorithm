package bronze4;

import java.util.Scanner;

public class bronze4_20233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int x = in.nextInt();
		int b = in.nextInt();
		int y = in.nextInt();
		int T = in.nextInt();
		

		int T1 = a + ((T > 30) ? ((T-30)*x)*21 : 0);
		int T2 = b + ((T > 45) ? ((T-45)*y)*21 : 0);
		
		System.out.printf("%d %d", T1, T2);
	}

}
