package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class silver4_1302 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			String input = br.readLine();
			if(map.containsKey(input)) {
				map.put(input, map.get(input)+1);
			} else {
				map.put(input, 1);
			}
		}
		
		Integer y = Collections.max(map.values());
		ArrayList<String> list = new ArrayList<>();
		for(String s : map.keySet()) {
			if(map.get(s).equals(y)){
				list.add(s);
			}
		}
		Collections.sort(list);
		
		bw.write(list.get(0));
		bw.flush();
		bw.close();
	}

}
