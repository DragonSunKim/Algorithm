package bronze4;

import java.util.Scanner;

public class bronze4_20867 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double M = in.nextDouble();
		double S = in.nextDouble();
		double G = in.nextDouble();
		
		double A = in.nextDouble();
		double B = in.nextDouble();
		
		double L = in.nextDouble();
		double R = in.nextDouble();
		
		System.out.println((((M/S)+(R/B)) > ((M/G)+(L/A))) ? "friskus" : "latmask" );
	}

}
