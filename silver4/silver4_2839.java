import java.util.Scanner;

// Coding By 김용선

public class silver4_2839 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int num_5 = N / 5;
        int num_3 = 0;
        int x = -1;
        for (int i = num_5; i > -1; i--) {

            int c = (N - (i * 5)) % 3;
            if (c == 0) {
                num_3 = (N - (i * 5)) / 3;
                num_5 = i;
                x = 1;
                break;
            }

        }
        System.out.println((x == -1) ? -1 : num_5 + num_3);
    }
}