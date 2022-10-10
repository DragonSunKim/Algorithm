package bronze2;

// Coding By 김용선.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bronze2_1009 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		
		String s;
		StringTokenizer st;
		
		int a,b;
		
		for(int i=0; i<T; i++) {
			s = bf.readLine();
			st = new StringTokenizer(s);
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a%10 == 1)
				bw.write("1\n");
			else if(a%10 == 2) {
				if(b%4 == 1)
					bw.write("2\n");
				else if(b%4 == 2)
					bw.write("4\n");
				else if(b%4 == 3)
					bw.write("8\n");
				else if(b%4 == 0)
					bw.write("6\n");
			}
			else if(a%10 == 3) {
				if(b%4 == 1)
					bw.write("3\n");
				else if(b%4 == 2)
					bw.write("9\n");
				else if(b%4 == 3)
					bw.write("7\n");
				else if(b%4 == 0)
					bw.write("1\n");
			}
			
			else if(a%10 == 4) {
				if(b%2 ==1)
					bw.write("4\n");
				else if(b%2 ==0)
					bw.write("6\n");
			}
			
			else if(a%10 == 5) {
				bw.write("5\n");
			}
			
			else if(a%10 == 6) {
				bw.write("6\n");
			}
			
			else if(a%10 == 7) {
				if(b%4 == 1)
					bw.write("7\n");
				else if(b%4 == 2)
					bw.write("9\n");
				else if(b%4 == 3)
					bw.write("3\n");
				else if(b%4 == 0)
					bw.write("1\n");
			}
			
			else if(a%10 == 8) {
				if(b%4 == 1)
					bw.write("8\n");
				else if(b%4 == 2)
					bw.write("4\n");
				else if(b%4 == 3)
					bw.write("2\n");
				else if(b%4 == 0)
					bw.write("6\n");
			}
			
			else if(a%10 == 9) {
				if(b%2 == 1)
					bw.write("9\n");
				else if(b%2 == 0)
					bw.write("1\n");
			}
			
			else if(a%10 == 0)
				bw.write("10\n");
		}
		bw.flush();
		bw.close();
	}

}
