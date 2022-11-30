package silver4;

// Coding By 김용선.

import java.util.*;
import java.io.*;

public class silver4_10825 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		String[][] array = new String[N][4];
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			st = new StringTokenizer(s);
			for(int j=0; j<4; j++) {
				array[i][j] = st.nextToken();
			}
		}
		
		Arrays.sort(array, new Comparator<String[]>() {
			public int compare(String[] s1, String[] s2) {
				if(Integer.parseInt(s1[1]) != Integer.parseInt(s2[1])) {
					return Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
				}
				else {
					if(Integer.parseInt(s1[2]) != Integer.parseInt(s2[2])) {
						return Integer.parseInt(s1[2]) - Integer.parseInt(s2[2]);
					}
					else {
						if(Integer.parseInt(s1[3]) != Integer.parseInt(s2[3])) {
							return Integer.parseInt(s2[3]) - Integer.parseInt(s1[3]);
						}
					}
				}

				return s1[0].compareTo(s2[0]);
			}
		});
		
		for(int i=0; i<N; i++) {
			bw.write(array[i][0]+"\n");
		}
		bw.flush();
		bw.close();
	}

}
