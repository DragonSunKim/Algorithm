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

public class silver5_11650 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] array = new int[N][2];
		StringTokenizer st;
		String s;
		for(int i=0; i<N; i++) {
			s = br.readLine();
			st = new StringTokenizer(s);
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		Arrays.sort(array, new Comparator<int[]>() {
			public int compare(int[] i1, int[] i2) {
				if(i1[0] < i2[0]) {
					return -1;
				}
				else if(i1[0] == i2[0]) {
					if(i1[1] < i2[1]) {
						return -1;
					}
					else {
						return 1;
					}
				}
				else
					return 1;
			}	
		});
		
	for(int i=0; i<N; i++) {
		bw.write(Integer.toString(array[i][0]) + " " + Integer.toString(array[i][1]) + "\n");
	}
	
	bw.flush();
	bw.close();
	}

}
