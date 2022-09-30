package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		int hour;
		int minute;
		if(M-45 <0) {
			if(H-1 <0) {
				hour = 24 +(H-1);
				minute = 60 +(M-45);
			}
			else {
				hour = H - 1;
				minute = 60 +(M-45);
			}
		}
		else {
			hour = H;
			minute = M-45;
		}
		
		System.out.print(hour+" "+minute);
	}

}
