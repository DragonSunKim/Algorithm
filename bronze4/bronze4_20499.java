package bronze4;

import java.util.Scanner;

public class bronze4_20499 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		String[] array = s.split("/");
		
		int K = Integer.parseInt(array[0]);
		int D = Integer.parseInt(array[1]);
		int A = Integer.parseInt(array[2]);
		
		if(K+A < D || D == 0)
			System.out.println("hasu");
		else
			System.out.println("gosu");
	}

}
