import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2851 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = in.nextInt();
        }

        int sum;
        for (int i = 0; i < 10; i++) {
            sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += array[j];
            }
            array2[i] = sum;
        }

        int output = array2[0];
        int min = Math.abs(array2[0] - 100);
        for (int i = 1; i < 10; i++) {
            if (min >= Math.abs(array2[i] - 100)) {
                min = Math.abs(array2[i] - 100);
                output = array2[i];
            }
        }

        System.out.println(output);
    }
}
