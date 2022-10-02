package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_19963 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		int total = in.nextInt();
		int first_bag= in.nextInt();
		int second_bag = in.nextInt();
		
		for(int i=1; i<=total; i++) {
			array.add(i);
		}
		
		int first_x;
		for(int i=0; i<first_bag; i++) {
			first_x = in.nextInt();
			array.remove(array.indexOf(first_x));
		}
		int second_x;
		for(int i=0; i<second_bag; i++) {
			second_x = in.nextInt();
			array.remove(array.indexOf(second_x));
		}
		
		System.out.println(total-first_bag-second_bag);
		for(int i=0; i<array.size(); i++) {
			if(i == array.size()-1)
				System.out.print(array.get(i));
			else
				System.out.print(array.get(i) + " ");
		}
	}

}
