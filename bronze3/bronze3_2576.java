package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2576 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x;
		ArrayList<Integer> array = new ArrayList<>();
		int sum=0;
		for(int i=0; i<7; i++) {
			x = in.nextInt();
			
			if(x % 2 == 1) {
				sum += x;
				array.add(x);
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			int min = array.get(0);
			for(int i=1; i<array.size(); i++) {
				min = (min > array.get(i)) ? min=array.get(i) : min;
			}
			
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
