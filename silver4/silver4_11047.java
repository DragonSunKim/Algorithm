import java.util.Scanner;

// Coding By 김용선.

public class silver4_11047 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); // 동전 종류
        int K = in.nextInt(); // 금액

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        int ans = 0;

        for (int i = N - 1; i > -1; i--) {
            if (K / array[i] != 0) {
                ans += K / array[i];
                K = K % array[i];
            }
            if (K == 0)
                break;
        }
        System.out.println(ans);
    }
}
