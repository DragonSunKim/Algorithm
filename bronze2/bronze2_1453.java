import java.util.Scanner;

// Coding By 김용선

public class bronze2_1453 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = 0;
        }

        int N = in.nextInt();
        int x;
        int count = 0;
        for (int i = 0; i < N; i++) {
            x = in.nextInt();

            if (array[x - 1] == 1)
                count++;
            else if (array[x - 1] == 0)
                array[x - 1] = 1;
        }

        System.out.println(count);
    }
}
