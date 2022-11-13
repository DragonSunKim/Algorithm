package bronze2;

import java.util.Arrays;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2587 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i=0; i<5; i++) {
			array[i] = in.nextInt();
		}
		
		Arrays.sort(array);
		
		System.out.println(Arrays.stream(array).sum()/5);
		System.out.println(array[2]);
	}

}
