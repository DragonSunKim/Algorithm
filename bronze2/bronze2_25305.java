import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

// Coding By 김용선.

public class bronze2_25305 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int k = in.nextInt();

        int[] score = new int[N];

        for (int i = 0; i < N; i++) {
            score[i] = in.nextInt();
        }

        IntStream is = Arrays.stream(score).sorted();

        score = is.toArray();

        System.out.println(score[N - k]);

    }
}
