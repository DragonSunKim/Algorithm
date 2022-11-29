package silver4;

// Coding By 김용선.

import java.util.*;
import java.io.*;

public class silver4_1764 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> map = new HashMap<>();

		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N; i++) {
			map.put(br.readLine(), 1);
		}
		
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<M; i++) {
			s = br.readLine();
			
			if(map.containsKey(s)) {
				
				list.add(s);
			}
		}
		
		Collections.sort(list);
		
		bw.write(list.size() + "\n");
		
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i) + "\n");
		}
		
		bw.flush();
		bw.close();
	}

}
