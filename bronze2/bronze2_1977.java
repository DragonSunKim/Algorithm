package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

// Coding By 김용선.

public class bronze2_1977 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(bf.readLine());
		int N = Integer.parseInt(bf.readLine());
		List<Integer> list = new ArrayList<>();
		int sum=0;
		for(int i=M; i<=N; i++) {
			
			for(int j=1; j<=100; j++) {
				if(Math.sqrt(i) == j) {
					list.add(i);
					sum += i;
				}
			}
			
		}
		
		System.out.println((list.isEmpty()) ? -1 : sum+"\n"+list.get(0));
	}

}
