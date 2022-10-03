package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int chang= 100;
		int sang= 100;
		int c,s;
		for(int i=0; i<n; i++) {
			c = in.nextInt();
			s = in.nextInt();
			
			if(c > s)
				sang = sang - c;
			else if(c < s)
				chang = chang -s;
		}
		System.out.println(chang);
		System.out.println(sang);
	}

}
