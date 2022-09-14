package bronze4;

import java.util.Scanner;

public class bronze4_13985 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		String[] array = input.split(" ");
		
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[2]);
		int c = Integer.parseInt(array[4]);
		
		if(a + b == c)
			System.out.print("YES");
		else
			System.out.print("NO");
	}

}
