package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_9325 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int s; // 자동차 가격
		int n; // 옵션 개수
		int q, p;
		int sum;
		for(int i=0; i<T; i++) {
			sum =0;
			s = in.nextInt();
			n = in.nextInt();
			sum += s;
			if(n==0) {
				System.out.println(sum);
				continue;
			}
			
			for(int j=0; j<n; j++) {
				q = in.nextInt();
				p = in.nextInt();
				
				sum += (q*p);
			}
			System.out.println(sum);
		}
	}

}
