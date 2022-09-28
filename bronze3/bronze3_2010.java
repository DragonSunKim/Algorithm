import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum = 0;
        int x;
        for (int i = 0; i < N; i++) {
            x = in.nextInt();

            if (i == N - 1)
                sum += x;
            else
                sum += (x - 1);
        }
        System.out.println(sum);
    }
}
