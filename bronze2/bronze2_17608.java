import java.util.Scanner;

// Coding By 김용선.

public class bronze2_17608 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = in.nextInt();
        }

        int max = list[N - 1];
        int count = 1;
        for (int i = N - 2; i > -1; i--) {
            if (list[i] > max) {
                max = list[i];
                count += 1;
            }
        }

        System.out.println(count);
    }
}
