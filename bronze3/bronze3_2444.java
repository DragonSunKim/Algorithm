import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2444 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // int M = N - 1;
        for (int i = N; i >= 1; i--) {
            if (i == N)
                continue;
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}