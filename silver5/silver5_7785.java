package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import java.util.StringTokenizer;

// Coding By 김용선.

public class silver5_7785 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());

		HashMap<String,String> map = new HashMap<>();
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			st = new StringTokenizer(input);
			
			map.put(st.nextToken(), st.nextToken());
		}
		List<String> list = new ArrayList<>();
		for(String s : map.keySet()) {
			if(map.get(s).equals("enter"))
				list.add(s);
		}
		Collections.sort(list, Collections.reverseOrder());
		
		for(String s : list)
			bw.write(s + "\n");
		bw.flush();
		bw.close();
	}

}
