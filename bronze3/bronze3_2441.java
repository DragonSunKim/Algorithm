import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2441 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = N - i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
