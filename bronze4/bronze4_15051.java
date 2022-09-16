import java.util.Arrays;
import java.util.Scanner;

public class bronze4_15051 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A1 = in.nextInt();
        int A2 = in.nextInt();
        int A3 = in.nextInt();

        int c1 = (A2 * 2) + (A3 * 4);
        int c2 = (A1 * 2) + (A3 * 2);
        int c3 = (A1 * 4) + (A2 * 2);

        int array[] = { c1, c2, c3 };

        Arrays.sort(array);

        System.out.println(array[0]);
    }
}
