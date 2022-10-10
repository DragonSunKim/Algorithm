package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_10988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String input = in.next();
		
		String reverse = "";
		
		for(int i=input.length()-1; i>-1; i--) {
			reverse += input.substring(i, i+1);
		}
		
		if(input.equals(reverse))
			System.out.println(1);
		else
			System.out.println(0);
	}

}
