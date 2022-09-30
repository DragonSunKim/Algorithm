package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2857 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s;
		ArrayList<Integer> array = new ArrayList<>(); 
		for(int i=1; i<=5; i++) {
			s = in.next();
			
			if(s.contains("FBI"))
				array.add(i);
		}
		
		if(array.isEmpty())
			System.out.print("HE GOT AWAY!");
		else {
			for(int i=0; i<array.size(); i++) {
				if(i == array.size()-1)
					System.out.print(array.get(i));
				else
					System.out.print(array.get(i)+" ");
			}
		}
	}

}
