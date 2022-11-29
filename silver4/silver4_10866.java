package silver4;

import java.io.*;
import java.util.*;

// Coding By 김용선.

public class silver4_10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new LinkedList<>();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			
			if(input.equals("pop_front")) {
				if(deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(Integer.toString(deque.pollFirst()) + "\n");
			}
			
			else if(input.equals("pop_back")) {
				if(deque.isEmpty())
					bw.write("-1\n");
				else
				bw.write(Integer.toString(deque.pollLast()) + "\n");
			}
				
			else if(input.equals("size")) {
				bw.write(Integer.toString(deque.size()) + "\n");
			}
			
			else if(input.equals("empty")) {
				if(deque.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			
			else if(input.equals("front")) {
				if(deque.isEmpty())
					bw.write("-1\n");
				else
					bw.write(Integer.toString(deque.peekFirst()) + "\n");
			}
			
			else if(input.equals("back")) {
				if(deque.isEmpty()) {
					bw.write("-1\n");
				}
				else
					bw.write(Integer.toString(deque.peekLast()) + "\n");
			}
			
			else {
				st = new StringTokenizer(input);
				if(st.nextToken().equals("push_front"))
					deque.addFirst(Integer.parseInt(st.nextToken()));
				else
					deque.addLast(Integer.parseInt(st.nextToken()));
			}
		}
	
	bw.flush();
	bw.close();
	}

}
