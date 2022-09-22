package bronze4;

import java.util.Scanner;

public class bronze4_20833 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int sum=0;
		for(int i=1; i<=N; i++) {
			sum += (i*i*i);
		}
		
		System.out.println(sum);
	}

}
