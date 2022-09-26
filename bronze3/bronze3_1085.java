import java.util.Scanner;

// Coding By 김용선.

public class bronze3_1085 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();

        int y_dif = Math.min(y, h - y);
        int x_dif = Math.min(x, w - x);

        System.out.println(Math.min(x_dif, y_dif));
    }
}