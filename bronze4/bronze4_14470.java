import java.util.Scanner;

public class bronze4_14470 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int time = 0;

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();

        if (A <= 0) {
            time = ((-A) * C) + D + (B * E);
        } else {
            time = (B - A) * E;
        }
        System.out.print(time);
    }
}