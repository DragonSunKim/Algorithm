package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Coding By 김용선.

public class bronze2_10820 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		
		int count_1, count_2, count_3, count_4;
		
		while((s = bf.readLine()) != null) {
			count_1 =0; // 소문자 갯수
			count_2 =0; // 대문자 갯수
			count_3 =0; // 숫자 갯수
			count_4 =0; // 공백 갯수
			for(int i=0; i<s.length(); i++) {
				
				if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
					count_2 += 1;
				else if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
					count_1 += 1;
				else if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
					count_3 += 1;
				else if(s.charAt(i) == 32)
					count_4 += 1;
			}
			bw.write(Integer.toString(count_1)+" "+Integer.toString(count_2)+" "+Integer.toString(count_3)+" "+Integer.toString(count_4)+"\n");
		}
		bw.flush();
		bw.close();
	}

}
