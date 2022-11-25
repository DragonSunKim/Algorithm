package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class silver4_10773 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int K = Integer.parseInt(br.readLine());
		
		for(int i=0; i<K; i++) {
			int input = Integer.parseInt(br.readLine());
			if(input != 0) {
				stack.add(input);
			}
			else {
				stack.pop();
			}
		}
		int sum = stack.stream().reduce((a,b) -> a+b).orElseGet(()-> 0);
		bw.write(Integer.toString(sum));
		bw.flush();
		bw.close();
	}

}
