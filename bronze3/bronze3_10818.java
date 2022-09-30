package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
	
		int num = in.nextInt();
		int min = num;
		int max = num;
		for(int i=1; i<N; i++) {
			num = in.nextInt();
			min = (min > num) ? num : min;
			max = (max < num) ? num : max;
		}
		System.out.println(min+" "+max);
	}

}
