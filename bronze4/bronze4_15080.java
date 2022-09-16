package bronze4;

import java.util.Scanner;

public class bronze4_15080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		String r = in.nextLine();
		
		String[] s_array = s.split(" : ");
		String[] r_array = r.split(" : ");
		
		int s_h = Integer.parseInt(s_array[0]);
		int s_m = Integer.parseInt(s_array[1]);
		int s_s = Integer.parseInt(s_array[2]);
		
		int r_h = Integer.parseInt(r_array[0]);
		int r_m = Integer.parseInt(r_array[1]);
		int r_s = Integer.parseInt(r_array[2]);
		
		int s_sum = (s_h*3600 + s_m*60 + s_s);
		int r_sum = (r_h*3600 + r_m*60 + r_s);
		
		if(r_sum >= s_sum) {
			System.out.print(r_sum-s_sum);
		}
		else {
			System.out.println((86400-s_sum) + r_sum);
		}

	}

}
