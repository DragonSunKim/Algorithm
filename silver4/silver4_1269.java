package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// Coding By 김용선.

public class silver4_1269 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> mapA = new HashMap<>();
		HashMap<String, String> mapB = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<a; i++) {
			mapA.put(st.nextToken(), "0");
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<b; i++) {
			mapB.put(st.nextToken(), "0");
		}
		
		Set<String> set = new HashSet<>();
		
		// A-B
		for(String s : mapB.keySet()) {
			if(!mapA.containsKey(s)) {
				set.add(s);
			}
		}
		
		for(String s : mapA.keySet()) {
			if(!mapB.containsKey(s)) {
				set.add(s);
			}
		}
		
		bw.write(Integer.toString(set.size()));
		bw.flush();
		bw.close();
	}
}
