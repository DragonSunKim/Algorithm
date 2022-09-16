import java.util.Scanner;

public class bronze4_14924 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int S = in.nextInt();
        int T = in.nextInt();
        int D = in.nextInt();

        int F = (D / (S * 2)) * T;

        System.out.print(F);
    }
}
