package bronze4;

import java.util.Scanner;

public class bronze4_13866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		
		int min = Math.abs((A+B)-(C+D));
		
		if (Math.abs((A+C)-(B+D)) < min)
			min = Math.abs((A+C)-(B+D));
		if (Math.abs((A+D)-(B+C)) < min)
			min = Math.abs((A+D)-(B+C));
		
		System.out.print(min);
		
	}

}
