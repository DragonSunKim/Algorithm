package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver5_10814 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] array = new String[N][3];
		StringTokenizer st;
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			
			array[i][0] = Integer.toString(i);
			array[i][1] = st.nextToken();
			array[i][2] = st.nextToken();
		}
		
		Arrays.sort(array, new Comparator<String[]>(){
			public int compare(String[] s1, String[] s2) {
				if(Integer.parseInt(s1[1]) < Integer.parseInt(s2[1]))
					return -1;
				else if(Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
					if(Integer.parseInt(s1[0]) < Integer.parseInt(s2[0]))
						return -1;
					else
						return 1;
				}
				else
					return 1;
			}
		});
		
		for(int i=0; i<N; i++) {
			bw.write(array[i][1] + " " + array[i][2] + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
