package silver4;

import java.util.*;
import java.io.*;

// Coding By 김용선.

public class silver4_11656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		String[] array = new String[input.length()];
		array[0] = input;

		int n=1;
		for(int i=1; i<input.length(); i++) {
			array[n] = input.substring(i, input.length());
			n++;
		}
		
		Arrays.sort(array);
		
		for(int j=0; j<array.length; j++) {
			bw.write(array[j]+"\n");
		}
		bw.flush();
		bw.close();
	}

}
