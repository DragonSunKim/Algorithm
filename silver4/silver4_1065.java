import java.util.Scanner;

// Coding By 김용선.

public class silver4_1065 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int total = 0;

        if (N < 100) {
            total = N;
        } else {
            total = 99;

            for (int i = 100; i <= N; i++) {
                int num_100 = i / 100;
                int num_10 = (i % 100) / 10;
                int num_1 = i % 10;
                int dif_0_1 = num_100 - num_10;
                int dif_1_2 = num_10 - num_1;

                if (dif_0_1 == dif_1_2)
                    total++;
            }
        }
        System.out.println(total);
    }
}
