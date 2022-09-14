package bronze4;

import java.util.ArrayList;
import java.util.Scanner;

public class bronze4_14038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		
		String x1 = in.nextLine();
		String x2 = in.nextLine();
		String x3 = in.nextLine();
		String x4 = in.nextLine();
		String x5 = in.nextLine();
		String x6 = in.nextLine();
		
		
		ArrayList<String> array = new ArrayList<String>();
		array.add(x1);
		array.add(x2);
		array.add(x3);
		array.add(x4);
		array.add(x5);
		array.add(x6);
		
		for(int i=0; i<6; i++) {
			if(array.get(i).equals("W"))
				count++;
		}
		
		if(count >= 5)
			System.out.print(1);
		else if(count >=3)
			System.out.print(2);
		else if(count >= 1)
			System.out.print(3);
		else
			System.out.print(-1);
	}

}
