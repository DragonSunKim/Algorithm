package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_10707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); // X사의 1리터당 요금
		int B = in.nextInt(); // Y사의 기본요금
		int C = in.nextInt(); // Y사의 기본요금 상한가
		int D = in.nextInt(); // Y사의 1리터당 추가요금
		
		int P = in.nextInt(); // 한 달 수도의 양
		
		int X = P*A;
		
		int Y = (P<=C) ? B : B+(P-C)*D;
		
		System.out.println((X>Y) ? Y : X);
	}

}
