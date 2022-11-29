package silver4;

import java.util.*;

// Coding By 김용선.

public class silver4_1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();

		ArrayList<Integer> array_A = new ArrayList<>();
		ArrayList<Integer> array_B = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			array_A.add(in.nextInt());
		}
		
		for(int i=0; i<N; i++) {
			array_B.add(in.nextInt());
		}
		
		Collections.sort(array_A);
		Collections.sort(array_B, Collections.reverseOrder());
		
		int output = 0;
		
		for(int i=0; i<N; i++) {
			output += (array_A.get(i)*array_B.get(i));
		}
		
		System.out.print(output);
	}

}
