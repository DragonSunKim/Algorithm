package bronze3;

import java.util.ArrayList;
import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String s;
		ArrayList<String> array = new ArrayList<>();
		
		for(int i=1; i<=N; i++) {
			s = "";
			for(int j=1; j<=N; j++) {
				if(j <= i)
					s += "*";
			}
			array.add(s);
		}
		
		for(int k=N-2; k>-1; k--) {
			array.add(array.get(k));
		}
		
		for(int i=0; i<array.size(); i++) {
			System.out.println(array.get(i));
		}
	}

}
