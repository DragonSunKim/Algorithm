package bronze4;

import java.util.Scanner;

public class bronze4_18414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int X = in.nextInt();
		int L = in.nextInt();
		int R = in.nextInt();
		
		int v=0;
		
		int min = Math.abs(L-X);
		for(int i=L; i<=R; i++) {
			if(min >= Math.abs(i-X)) {
				min = Math.abs(i-X);
				v = i;
			}
		}
		
		System.out.println(v);
	}

}
