package bronze4;

import java.util.Scanner;

public class bronze4_19698 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int W = in.nextInt();
		int H = in.nextInt();
		int L = in.nextInt();
		
		int max_room = (W/L) * (H/L);
		
		if(N >= max_room)
			System.out.println(max_room);
		else
			System.out.println(N);
		
		
	}

}
