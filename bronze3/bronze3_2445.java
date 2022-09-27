import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2445 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 1; i <= (2 * N) - 1; i++) {
            if (i <= N) {
                for (int j = 1; j <= (2 * N); j++) {
                    if (j <= i || j >= (2 * N) - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = (2 * N); j >= 1; j--) {
                    if (j > i || j < (2 * N) - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
