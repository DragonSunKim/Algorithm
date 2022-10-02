package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_3460 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int n;
		String s; // 2진수 변환
		String s_reverse;
		String output; // 1 위치 출력
		
		for(int i=0; i<T; i++) {
			n =in.nextInt();
			output = "";
			s_reverse = "";
			s = Integer.toBinaryString(n);
			
			for(int k=s.length()-1; k>-1; k--) {
				s_reverse += s.substring(k, k+1);
			}
			
			for(int j=0; j<s_reverse.length(); j++) {
				if(s_reverse.substring(j,j+1).equals("1"))
					output +=(j +" ");
			}
			output = output.trim();
			System.out.println(output);
		}
		
	}

}
