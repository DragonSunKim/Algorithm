package bronze4;

import java.util.Scanner;

public class bronze4_20839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int z1 = in.nextInt();
		
		if(x1 == x && y1 == y && z1 == z)
			System.out.println("A");
		else if((x1 >= (x/2)) && y1 == y && z1 == z)
			System.out.println("B");
		else if(y1 == y && z1 == z)
			System.out.println("C");
		else if((y1 >= (y/2)) && z1 == z)
			System.out.println("D");
		else
			System.out.println("E");
	}

}
