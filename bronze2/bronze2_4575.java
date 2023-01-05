package bronze2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class bronze2_4575 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		ArrayList<String> answer = new ArrayList<>();
		while(true) {
			String input = in.nextLine();
			
			if(input.equals("END")) {
				break;
			}
			
			int c = 1;
			HashSet<String> set = new HashSet<>();
			for(int i=0; i<input.length(); i++) {
				String x = input.substring(i,i+1);
				
				if(x.isBlank()) {
					continue;
				} else {
					if(!set.contains(x)) {
						set.add(x);
					} else {
						c = -1;
						break;
					}
				}
				
			} // for
			
			if(c==1) 
				answer.add(input);
			
		} // while
		
		for(String s : answer) {
			System.out.println(s);
		}

	}

}
