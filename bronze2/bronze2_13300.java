import java.util.Scanner;

// Coding By 김용선.

public class bronze2_13300 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        int[][] array = new int[6][2];
        int S;
        int Y;
        for (int i = 0; i < N; i++) {
            S = in.nextInt();
            Y = in.nextInt();

            array[Y - 1][S]++;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                sum += Math.ceil(array[i][j] / (double) K);
        }
        System.out.println(sum);
    }
}
