package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Coding By 김용선.

public class bronze2_5585 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int c = 1000 - Integer.parseInt(bf.readLine());
		
		int c_500 = c/500;
		c = c - (c_500 * 500);
		
		int c_100 = c/100;
		c = c - (c_100 * 100);
		
		int c_50 = c/50;
		c = c - (c_50*50);
		
		int c_10 = c/10;
		c = c - (c_10*10);
		
		int c_5 = c/5;
		c = c - (c_5*5);
		
		bw.write(Integer.toString(c_500+c_100+c_50+c_10+c_5+c));
		bw.flush();
		bw.close();
	}

}
