package silver4;

// Coding By 김용선.

import java.util.*;
import java.io.*;

public class silver4_2003 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		
		int[] array = new int[N];
		
		s = br.readLine();
		st = new StringTokenizer(s);
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		long sum = 0;
		long ans=0;
		for(int i=0; i<N; i++) {
			sum = 0;
			for(int j=i; j<N; j++) {
				sum += array[j];
				
				if(sum == M) {
					ans++;
					break;
				}
				else if(sum > M) {
					break;
				}
			}
		}
		bw.write(Long.toString(ans));
		bw.flush();
		bw.close();
	}

}
