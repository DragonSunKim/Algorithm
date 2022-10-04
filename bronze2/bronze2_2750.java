package bronze2;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		ArrayList<Integer> array = new ArrayList<>();
		int x;
		for(int i=0; i<N; i++) {
			x = in.nextInt();
			array.add(x);
		}
		array.sort((a,b)-> a-b);
		for(int c : array)
			System.out.println(c);
	}

}
