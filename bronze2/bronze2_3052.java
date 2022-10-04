package bronze2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Coding By 김용선.

public class bronze2_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		int x;
		for(int i=0; i<10; i++) {
			x = in.nextInt();
			set.add(x%42);
		}
		System.out.println(set.size());
	}

}
