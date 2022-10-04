package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// Coding By 김용선.

public class bronze2_1712 {

	public static void main (String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		long n;
		if(C <= B) {
			n = -1;
		}
		else {
			n = A/(C-B)+1;
		}
		System.out.println(n);
	}

}