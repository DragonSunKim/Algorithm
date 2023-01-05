package bronze1;

import java.util.ArrayList;
import java.util.Scanner;

public class bronze1_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
			
			list.add(method(k, n));
			
		}
		
		for(int x : list) {
			System.out.println(x);
		}
	}
	
	public static int method(int k, int n) {
		int[][] array = new int[k][n];
		
		for(int i=1; i<=n; i++) {
			array[0][i-1] = i;
		}
		int sum = 0;
		for(int i=1; i<k; i++) {
			for(int j=0; j<n; j++) {
				sum = 0;
				for(int m=0; m<=j; m++) {
					sum += array[i-1][m];
				}
				
				array[i][j] = sum;
			}
		}
		int answer =0;
		for(int i=0; i<n; i++) {
			answer += array[k-1][i]; 
		}
		
		return answer;
	}
}

