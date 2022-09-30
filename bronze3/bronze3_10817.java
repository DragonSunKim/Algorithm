package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		array.add(in.nextInt());
		array.add(in.nextInt());
		array.add(in.nextInt());
		
		array.remove(array.indexOf(Math.max(array.get(0), Math.max(array.get(1), array.get(2)))));
		
		System.out.print(array.get(array.indexOf(Math.max(array.get(0), array.get(1)))));	
		
	}

}
