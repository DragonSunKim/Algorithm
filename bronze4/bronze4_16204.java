import java.util.Scanner;

public class bronze4_16204 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        int K = in.nextInt();

        int ans = Math.min(M, K) + Math.min(N - M, N - K);

        System.out.print(ans);
    }
}
