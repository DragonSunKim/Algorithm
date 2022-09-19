package bronze4;

import java.util.Scanner;

public class bronze4_16727 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int p1 = in.nextInt();
		int s1 = in.nextInt();
		int s2 = in.nextInt();
		int p2 = in.nextInt();
		
		if((p1+p2) > (s1+s2)) {
			System.out.print("Persepolis");
		}
		else if((p1+p2) < (s1+s2)) {
			System.out.print("Esteghlal");
		}
		else {
			if(s1 > p2) {
				System.out.print("Esteghlal");
			}
			else if(s1 < p2) {
				System.out.print("Persepolis");
			}
			else {
				System.out.print("Penalty");
			}
		}
	}

}
