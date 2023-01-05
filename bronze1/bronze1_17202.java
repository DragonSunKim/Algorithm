package bronze1;

import java.util.Scanner;

public class bronze1_17202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String A = in.next();
		String B = in.next();
		
		
		System.out.println(method(A,B));
	}
	
	public static String method(String A, String B) {
		String output ="";
		
		for(int i=0; i<8; i++) {
			output += A.substring(i,i+1);
			output += B.substring(i,i+1);
		}
		
		String nextOutput = "";
		
		while(output.length() != 2) {
			nextOutput = "";
			
			for(int i=0;i<output.length()-1; i++) {
				int x = Integer.parseInt(output.substring(i, i+1));
				int y = Integer.parseInt(output.substring(i+1, i+2));
				int answer = (x+y) % 10;
				nextOutput += (answer);
				
			}
			
			output = nextOutput;
			
		}
		
		return output;
	}
}
