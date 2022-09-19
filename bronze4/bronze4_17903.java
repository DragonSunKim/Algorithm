package bronze4;

import java.util.Scanner;

public class bronze4_17903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		int n = in.nextInt();
		in.nextLine();
		String s;
		for(int i=0; i<m; i++) {
			s = in.nextLine();
		}
		
		if (m >= 8)
			System.out.print("satisfactory");
		else
			System.out.print("unsatisfactory");
	}

}
