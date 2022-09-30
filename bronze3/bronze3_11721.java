package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		int len = s.length();
		int count=0;
		if(len % 10 == 0) {
			for(int i=0; i<len/10; i++) {
				System.out.println(s.substring(i+count, i+10+count));
				count+=9; 
			}
		}
		else {
			for(int i=0; i<(len/10)+1 ; i++) {
				if(len < 10) {
					System.out.println(s.substring(0, len));
				}
				else {
					if(i == (len/10)) {
						System.out.println(s.substring(i+count, i+count+s.length()%10));
					}
					else {
						System.out.println(s.substring(i+count, i+10+count));
						count+=9;
					}
				}
			}
		}
	}
}
