package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_3058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		ArrayList<Integer> array = new ArrayList<>();
		
		int x;
		int sum;
		int min;
		for(int i=0; i<T; i++) {
			sum =0;
			array.clear();
			for(int j=0; j<7; j++) {
				x = in.nextInt();
				
				if(x%2 == 0) {
					array.add(x);
					sum += x;
				}
			}
			min = array.get(0);
			for(int k=1; k<array.size(); k++) {
				if(min > array.get(k))
					min = array.get(k);
			}
			System.out.printf("%d %d\n", sum, min);
			
		}
	}

}
