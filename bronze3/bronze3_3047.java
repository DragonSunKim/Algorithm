package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_3047 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		ArrayList<Integer> array = new ArrayList<>();
		array.add(x);
		array.add(y);
		array.add(z);
		int C = Math.max(x, Math.max(y, z));
		array.remove(array.indexOf(C));
		int A = Math.min(array.get(0), array.get(1));
		array.remove(array.indexOf(A));
		int B = array.get(0);
		
		String s = in.next();
		String output = "";
		for(int i=0; i<3; i++) {
			if(s.substring(i,i+1).equals("A"))
				output += (A+ " "); 
			else if(s.substring(i,i+1).equals("B"))
				output += (B+ " ");
			else if(s.substring(i,i+1).equals("C"))
				output += (C+ " ");
		}
		System.out.print(output.trim());
		
	}

}
