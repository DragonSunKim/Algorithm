import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2460 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[10];
        array[0] = 0;
        int x = 0; // 내린 사람
        int y = 0; // 탄 사람

        for (int i = 0; i < 10; i++) {
            x = in.nextInt();
            y = in.nextInt();
            if (i != 0)
                array[i] = array[i - 1] + (y - x);
            else
                array[i] += y;
        }

        int max = Math.max(array[0], Math.max(array[1], Math.max(array[2], Math.max(array[3], Math.max(array[4],
                Math.max(array[5], Math.max(array[6], Math.max(array[7], Math.max(array[8], array[9])))))))));
        System.out.println(max);
    }
}
