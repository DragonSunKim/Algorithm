import java.util.Scanner;

// Coding By 김용선.

public class bronze2_1075 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int F = in.nextInt();
        String s;
        int output = -1;
        for (int i = 0; i < 100; i++) {
            if (i >= 0 && i <= 9) {
                s = Integer.toString(N);
                s = s.substring(0, s.length() - 2) + "0" + Integer.toString(i);

            } else {
                s = Integer.toString(N);
                s = s.substring(0, s.length() - 2) + Integer.toString(i);
            }

            if (Integer.parseInt(s) % F == 0) {
                output = i;
                break;
            }
        }

        System.out.printf("%02d", output);

    }
}
