package bronze2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

// Coding By 김용선.

public class bronze2_13458 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(bf.readLine());
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		ArrayList<Integer> array = new ArrayList<>();
		
		while(st.hasMoreTokens())
			array.add(Integer.parseInt(st.nextToken()));
		
		s = bf.readLine();
		st = new StringTokenizer(s);
		ArrayList<Integer> array_2 = new ArrayList<>();
		
		while(st.hasMoreTokens())
			array_2.add(Integer.parseInt(st.nextToken()));
		
		for(int i=0; i<array.size(); i++) {
			array.set(i, (array.get(i) - array_2.get(0) >= 0) ? array.get(i) - array_2.get(0) : 0);
		}
		
		long count = N;
		for(int i=0; i<array.size(); i++) {
			if(array.get(i) % array_2.get(1) == 0) {
				count += array.get(i) / array_2.get(1);
			}
			else
				count += (array.get(i) / array_2.get(1)) + 1;
		}
		
		System.out.println(count);
	}
}
