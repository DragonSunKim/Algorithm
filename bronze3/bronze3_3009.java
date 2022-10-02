package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_3009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int x;
		int y;
		
		int[] x_array = new int[3];
		int[] y_array = new int[3];
		
		for(int i=0; i<3; i++) {
			x = in.nextInt();
			y = in.nextInt();
			
			x_array[i] = x;
			y_array[i] = y;
			
		}
		
		if(x_array[0] == x_array[1])
			System.out.print(x_array[2]);
		else if(x_array[0] == x_array[2])
			System.out.print(x_array[1]);
		else if(x_array[1] == x_array[2])
			System.out.print(x_array[0]);
		
		if(y_array[0] == y_array[1])
			System.out.print(" "+y_array[2]);
		else if(y_array[0] == y_array[2])
			System.out.print(" "+y_array[1]);
		else if(y_array[1] == y_array[2])
			System.out.print(" "+y_array[0]);
	}

}
