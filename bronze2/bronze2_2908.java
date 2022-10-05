import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2908 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.next();
        String B = in.next();

        String s1 = "";
        for (int i = 2; i >= 0; i--) {
            s1 += A.substring(i, i + 1);
        }

        String s2 = "";
        for (int i = 2; i >= 0; i--) {
            s2 += B.substring(i, i + 1);
        }

        System.out.print((Integer.parseInt(s1) > Integer.parseInt(s2)) ? s1 : s2);
    }
}
