package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class silver4_1920 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] array_N = new int[N];
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		for(int i=0; i<N; i++) {
			array_N[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] array_M = new int[M];
		input = br.readLine();
		st = new StringTokenizer(input);
		
		for(int i=0; i<M; i++) {
			array_M[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array_N);
		
		for(int i=0; i<array_M.length; i++) {
			int start = 0;
			int end = N-1;
			int mid = (start+end)/2;
			int c = 0;
			while(end >= start) {
				
				if(array_N[mid] == array_M[i]) {
					c = 1;
					break;
				}
				else if(array_N[mid] < array_M[i]) {
					start = mid+1;
					mid = (start+end)/2;
				}
				else if(array_N[mid] > array_M[i]) {
					end = mid-1;
					mid = (start+end)/2;
				}
			}
			if(c==1)
				bw.write("1\n");
			else
				bw.write("0\n");
		}
		bw.flush();
		bw.close();

	}
}
