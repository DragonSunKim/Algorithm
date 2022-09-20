package bronze4;

import java.util.Scanner;

public class bronze4_18409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		in.nextLine();
		String S = in.nextLine();
		int sum=0;
		for(int i=0; i<S.length(); i++) {
			if(S.charAt(i) == 'a')
				sum += 1;
			else if(S.charAt(i) == 'e')
				sum += 1;
			else if(S.charAt(i) == 'i')
				sum += 1;
			else if(S.charAt(i) == 'o')
				sum += 1;
			else if(S.charAt(i) == 'u')
				sum += 1;
		}
		
		System.out.println(sum);
	}

}
