package silver4;

import java.util.*;
import java.io.*;
// Coding By 김용선.

public class silver4_10816 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		int[] array_N = new int[N];
		
		String s = br.readLine();
		st = new StringTokenizer(s);
		for(int i=0; i<N; i++) {
			array_N[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int M = Integer.parseInt(br.readLine());
		int[] array_M = new int[M];
		
		s = br.readLine();
		st = new StringTokenizer(s);
		for(int i=0; i<M; i++) {
			array_M[i] = Integer.parseInt(st.nextToken());
		}
		int[] array_M_clone = array_M.clone();
		
		HashMap<Integer, Integer> map = bs(array_N, array_M);
		
		for(int i=0; i<M; i++) {
			if(map.containsKey(array_M_clone[i])) {
				bw.write(map.get(array_M_clone[i]) + " ");
			}
			else {
				bw.write("0 ");
			}
		}

		
		bw.flush();
		bw.close();
	}
	
	public static HashMap<Integer, Integer> bs(int[] a1, int[] a2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		
		Arrays.sort(a2);
		
		for(int i=0; i<a1.length; i++) {
			if(map.containsKey(a1[i])) {
				map.put(a1[i], map.get(a1[i])+1);
				continue;
			}
			
			int start = 0;
			int end = a2.length-1;
			int mid = (start+end)/2;

			while(end >= start) {
				
				if(a1[i] == a2[mid]) {
					map.put(a1[i], 1);
					break;
				}
				else if(a1[i] < a2[mid]) {
					end = mid-1;
					mid = (start+end)/2;
				}
				
				else if(a1[i] > a2[mid]) {
					start = mid+1;
					mid = (start+end)/2;
				}
			}

		}
		return map;
	}
}
