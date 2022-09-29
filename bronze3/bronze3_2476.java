import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2476 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int x, y, z;
        int max = 0;
        int sum;
        for (int i = 0; i < N; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            sum = 0;
            if (x == y && y == z)
                sum = 10000 + x * 1000;
            else if (x == y)
                sum = 1000 + x * 100;
            else if (x == z)
                sum = 1000 + x * 100;
            else if (y == z)
                sum = 1000 + y * 100;
            else
                sum = Math.max(x, Math.max(y, z)) * 100;

            if (sum > max)
                max = sum;
        }
        System.out.println(max);
    }
}
