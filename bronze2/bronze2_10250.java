import java.util.Scanner;

// Coding By 김용선.

public class bronze2_10250 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int H, W, N;
        int x, y;
        for (int i = 0; i < T; i++) {
            H = in.nextInt();
            W = in.nextInt();
            N = in.nextInt();

            x = (N % H != 0) ? N % H : H; // 층
            y = (N % H != 0) ? (N / H) + 1 : N / H;
            System.out.printf("%d%02d\n", x, y);
        }
    }
}
