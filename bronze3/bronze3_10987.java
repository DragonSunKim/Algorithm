package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10987 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int sum=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i,i+1).equals("a"))
				sum +=1;
			else if(s.substring(i,i+1).equals("e"))
				sum +=1;
			else if(s.substring(i,i+1).equals("i"))
				sum +=1;
			else if(s.substring(i,i+1).equals("o"))
				sum +=1;
			else if(s.substring(i,i+1).equals("u"))
				sum +=1;
		}
		
		System.out.println(sum);
	}

}
