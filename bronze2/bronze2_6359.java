import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// Coding By 김용선.

public class bronze2_6359 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        int n;
        int[] room;
        for (int i = 0; i < T; i++) {
            n = in.nextInt();

            room = new int[n];
            for (int j = 0; j < n; j++) {
                room[j] = 0;
            }

            for (int m = 2; m <= n; m++) {
                for (int k = 1; k < n; k++) {
                    if ((k + 1) % m == 0) {
                        if (room[k] == 0)
                            room[k] = 1;
                        else if (room[k] == 1)
                            room[k] = 0;
                    }
                }
            }

            IntStream is = Arrays.stream(room);
            System.out.println(is.filter(x -> {
                return x == 0;
            }).count());
        }

    }
}
