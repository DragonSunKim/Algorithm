package silver5;

import java.util.*;
import java.io.*;

// Coding By 김용선.

public class silver5_1181 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] array = new String[N];
        
        for(int i=0; i<N; i++) {
        	array[i] = br.readLine();
        }
        Set<String> set = new HashSet<>(Arrays.asList(array));
        array = set.toArray(new String[0]);
        Arrays.sort(array, new Comparator<String>() {
        	public int compare(String s1, String s2) {
        		if(s1.length() != s2.length()) {
        			return s1.length() - s2.length();
        		}
        		else {
        			return s1.compareTo(s2);
        		}
        	}
        });
        
        for(int i=0; i<array.length; i++) {
        	bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
	}

}
