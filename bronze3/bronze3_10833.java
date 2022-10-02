package bronze3;

import java.util.Scanner;

// Coding By 김용선

public class bronze3_10833 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int sum=0;
		int x,y;
		
		for(int i=0; i<N; i++) {
			x = in.nextInt(); // 학생 수
			y = in.nextInt(); // 사과 수
			
			sum += y%x;
		}
		System.out.print(sum);
	}

}
