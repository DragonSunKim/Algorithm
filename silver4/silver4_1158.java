package silver4;

import java.util.*;

public class silver4_1158 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int N = in.nextInt();
		int K = in.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		for(int i=0; i<N; i++) {
			
			for(int j=0; j<K-1; j++) {
				queue.add(queue.poll());
			}
			
			if(i==0) {
				sb.append(queue.poll());
			}
			else {
				sb.append(", " + queue.poll());
			}
		}
		sb.append(">");
		System.out.print(sb.toString());
		
		in.close();
	}
	
}
