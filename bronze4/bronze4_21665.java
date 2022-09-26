package bronze4;

import java.util.Scanner;

public class bronze4_21665 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();

		String[] s = new String[n];
		
		for(int i=0; i<n; i++) {
			s[i] = in.next();
		}
		

		in.nextLine();
		String[] s2 = new String[n];
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			s2[i] = in.next();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(s[i].substring(j,j+1).equals(s2[i].substring(j,j+1)))
					count += 1;
				else
					continue;
				}
		}
		
		
		System.out.println(count);
	}
}
