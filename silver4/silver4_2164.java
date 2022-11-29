package silver4;

import java.util.*;


public class silver4_2164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		int N = in.nextInt();
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		if(N == 1) {
			System.out.println(queue.peek());
		}
		else {
			while(true) {
				queue.poll();
				
				if(queue.size()==1)
					break;
				
				queue.add(queue.poll());
			}
			System.out.println(queue.peek());
		}
		
		
	}

}
