package bronze4;

import java.util.Scanner;

public class bronze4_15873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		if(s.length() ==2) {
			System.out.print(Integer.parseInt(s.substring(0,1)) + Integer.parseInt(s.substring(1)));
		}
		else if(s.length() == 3) {
			if(s.substring(0,2).equals("10")) {
				System.out.print(Integer.parseInt(s.substring(0,2)) + Integer.parseInt(s.substring(2)));
			}
			else if(s.substring(1).equals("10")) {
				System.out.print(Integer.parseInt(s.substring(0,1)) + Integer.parseInt(s.substring(1)));
			}
		}
		else if(s.length() == 4) {
			System.out.print(20);
		}
	}

}
