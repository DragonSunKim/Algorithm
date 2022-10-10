package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Coding By 김용선.

public class bronze2_1100 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s;
		
		int count=0;
		for(int i=0; i<8; i++) {
			s = bf.readLine();
			
			if(i%2 ==0) {
				if(s.substring(0,1).equals("F"))
					count += 1;
				if(s.substring(2,3).equals("F"))
					count += 1;
				if(s.substring(4,5).equals("F"))
					count += 1;
				if(s.substring(6,7).equals("F"))
					count += 1;
			}
			else {
				if(s.substring(1,2).equals("F"))
					count += 1;
				if(s.substring(3,4).equals("F"))
					count += 1;
				if(s.substring(5,6).equals("F"))
					count += 1;
				if(s.substring(7,8).equals("F"))
					count += 1;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
	}

}
