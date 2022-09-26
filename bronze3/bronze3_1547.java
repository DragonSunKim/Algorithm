package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int M = in.nextInt();
		
		int X,Y;
		
		int[] array = {1, 2, 3};
		int[] array_clone;
		for(int i=0; i<M; i++) {
			X = in.nextInt();
			Y = in.nextInt();
			array_clone = array;
//			array[Y-1] = X;
//			array[X-1] = Y;
			
			for(int j=0; j<array.length; j++) {
				if(array_clone[j] == X)
					array[j] = Y;
				else if(array_clone[j] == Y)
					array[j] = X;
			}
		}
		
		System.out.println(array[0]);
	}

}
