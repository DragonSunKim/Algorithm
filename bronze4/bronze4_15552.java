package bronze4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class bronze4_15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bf.readLine());
		String array[];
		String input;
		for(int i=0; i<T; i++) {
			input = bf.readLine();
			array = input.split(" ");
			bw.write(Integer.parseInt(array[0]) + Integer.parseInt(array[1])+"\n");
		}
		bw.close();
	}

}
