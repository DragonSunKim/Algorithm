package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver4_3036 {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		st = new StringTokenizer(input);
		
		int[] array = new int[N];
		
		for(int i=0; i<N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<N; i++) {
			func(array[0], array[i]);
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void func(int x, int y) throws IOException{
		for(int i=y; i>0; i--) {
			if(x % i == 0 && y % i == 0) {
				int a = x/i;
				int b = y/i;
				
				bw.write(a + "/" + b + "\n");
				break;
			}
		}
		
	}
}
