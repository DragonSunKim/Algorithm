import java.util.Scanner;

// Coding By 김용선.

public class bronze3_1267 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }
        int sum_Y = 0;
        for (int i = 0; i < N; i++) {
            sum_Y += ((array[i] / 30) + 1) * 10;
        }

        int sum_M = 0;
        for (int i = 0; i < N; i++) {
            sum_M += ((array[i] / 60) + 1) * 15;
        }

        if (sum_Y < sum_M)
            System.out.println("Y " + sum_Y);
        else if (sum_Y > sum_M)
            System.out.println("M " + sum_M);
        else if (sum_Y == sum_M)
            System.out.println("Y M " + sum_Y);
    }
}
