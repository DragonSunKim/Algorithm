package bronze4;

import java.util.Scanner;

public class bronze4_18698 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		in.nextLine();
		String s;
		for(int i=0; i<T; i++) {
			s = in.nextLine();
			
			if(s.indexOf("D") == -1)
				System.out.println(s.length());
			else
				System.out.println(s.indexOf("D"));
			
		}
		
//		String a = "UUUDU";
//		
//		System.out.println(a.indexOf("U"));
	}

}
