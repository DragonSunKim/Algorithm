import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1357 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int X = in.nextInt();
        int Y = in.nextInt();

        String X_string = Integer.toString(X);
        String Y_string = Integer.toString(Y);

        String n = "";
        for (int i = X_string.length() - 1; i > -1; i--) {
            n += X_string.substring(i, i + 1);
        }
        X = Integer.parseInt(n);

        n = "";
        for (int i = Y_string.length() - 1; i > -1; i--) {
            n += Y_string.substring(i, i + 1);
        }
        Y = Integer.parseInt(n);

        String total_string = Integer.toString(X + Y);

        n = "";
        for (int i = total_string.length() - 1; i > -1; i--) {
            n += total_string.substring(i, i + 1);
        }
        System.out.println(Integer.parseInt(n));
    }
}
