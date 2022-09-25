package bronze4;

import java.util.Scanner;

public class bronze4_21638 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int t1 = in.nextInt();
		int v1 = in.nextInt();
		int t2 = in.nextInt();
		int v2 = in.nextInt();
		
		if(t2 < 0 && v2 >= 10)
			System.out.println("A storm warning for tomorrow! Be careful and stay home if possible!");
		else if(t2 < t1)
			System.out.println("MCHS warns! Low temperature is expected tomorrow.");
		else if(v2 > v1)
			System.out.println("MCHS warns! Strong wind is expected tomorrow.");
		else
			System.out.println("No message");
	}

}
