import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2506 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int sum = 0;
        int count = 0;
        int x;
        for (int i = 0; i < N; i++) {
            x = in.nextInt();

            if (x == 0) {
                sum += x;
                count = 0;
            } else if (x == 1) {
                count += 1;
                sum += count;
            }

        }

        System.out.println(sum);
    }
}
