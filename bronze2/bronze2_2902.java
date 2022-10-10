package bronze2;

import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		String[] array = s.split("-");
		
		for(String l : array){
			System.out.print(l.substring(0,1));
		}
	}

}
