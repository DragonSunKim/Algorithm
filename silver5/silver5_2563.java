import java.util.Scanner;

// Coding By 김용선.

public class silver5_2563 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] board = new int[100][100];

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();

            for (int n = y; n < y + 10; n++) {
                for (int m = x; m < x + 10; m++) {
                    board[n][m] = 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += board[i][j];
            }
        }
        System.out.println(sum);
    }
}
