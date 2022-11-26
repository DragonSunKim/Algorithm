package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class silver4_10845 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		Queue<Integer> queue = new LinkedList<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			
			if(input.equals("pop")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(Integer.toString(queue.poll()) + "\n");
			}
			
			else if(input.equals("size")) {
				bw.write(Integer.toString(queue.size()) + "\n");
			}
			
			else if(input.equals("empty")) {
				if(queue.isEmpty())
					bw.write("1\n");
				else
					bw.write("0\n");
			}
			
			else if(input.equals("front")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else
					bw.write(Integer.toString(queue.peek()) + "\n");
			}
			
			else if(input.equals("back")) {
				if(queue.isEmpty())
					bw.write("-1\n");
				else {
					int x = (int) queue.toArray()[queue.size()-1];
					bw.write(Integer.toString(x) + "\n");
				}					
			}
			else {
				st = new StringTokenizer(input);
				st.nextToken();
				queue.add(Integer.parseInt(st.nextToken()));
			}
		}
		bw.flush();
		bw.close();
	}

}
