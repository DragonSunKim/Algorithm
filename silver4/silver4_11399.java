import java.util.Arrays;
import java.util.Scanner;

// Coding By 김용선.

public class silver4_11399 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = in.nextInt();
        }

        Arrays.sort(array);

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                sum += array[j];
            }
        }
        System.out.println(sum);

        in.close();
    }
}
