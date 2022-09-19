package bronze4;

import java.util.Scanner;

public class bronze4_17863 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		int N = in.nextInt();
		
		int a = N / 1000000;
		int b = (N % 1000000) / 100000;
		int c = (N % 100000) / 10000;
		
		System.out.print((a==5 && b==5 && c==5) ? "YES" : "NO");
	}

}
