package bronze3;

import java.util.Scanner;

// Coding By 김용선.

public class bronze3_1703 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String a;
		String[] array;
		
		long sum;
		
		while(true) {
			a = in.nextLine();
			
			if(a.equals("0"))
				break;
			
			array = a.split(" ");
			
			sum = 1;
			
			for(int i=1; i<array.length; i=i+2) {
				sum = (sum*Long.parseLong(array[i])) - Long.parseLong(array[i+1]);
			}
			
			
			System.out.println(sum);
		}
	}

}
