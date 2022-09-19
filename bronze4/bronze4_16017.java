package bronze4;

import java.util.Scanner;

public class bronze4_16017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		if((a==8 || a==9) && (d==8 || d==9) && (b == c))
			System.out.print("ignore");
		else
			System.out.print("answer");
	}

}
