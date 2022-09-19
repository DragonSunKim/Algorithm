package bronze4;

import java.util.Scanner;

public class bronze4_17874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int h = in.nextInt();
		int v = in.nextInt();
		
		int s1 = v*h*4;
		int s2 = (n-v)*(h)*4;
		int s3 = (n-h)*v*4;
		int s4 = (n-h)*(n-v)*4;
		
		System.out.print(Math.max(s1, Math.max(s2, Math.max(s3, s4))));
	}

}
