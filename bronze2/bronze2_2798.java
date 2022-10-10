package bronze2;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;



// Coding By 김용선.

public class bronze2_2798 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		s = bf.readLine();
		st = new StringTokenizer(s);
		
		ArrayList<Integer> array = new ArrayList<>();
		
		while(st.hasMoreTokens())
			array.add(Integer.parseInt(st.nextToken()));
		
		int sum = 0;
		int min = 1000000;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					sum += array.get(i)+array.get(j)+array.get(k);
					
					if(M - sum < min && M-sum >=0)
						min = M-sum;
					
					sum = 0;
				}
			}
		}
		
		System.out.println(M-min);
	}

}
