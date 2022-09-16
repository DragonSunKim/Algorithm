package bronze4;

import java.util.Scanner;

public class bronze4_15059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int Ca = in.nextInt();
		int Ba = in.nextInt();
		int Pa = in.nextInt();
		
		int Cr = in.nextInt();
		int Br = in.nextInt();
		int Pr = in.nextInt();
		
		int sum = 0;
		
		if((Cr-Ca) > 0)
			sum += (Cr-Ca);
		
		if((Br-Ba) > 0)
			sum += (Br-Ba);
		
		if((Pr-Pa) > 0)
			sum += (Pr-Pa);
		
		System.out.print(sum);
		
	}

}
