import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2292 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 1;
        int result = 1;
        int i = 1;
        while (true) {

            if (N <= count) {
                break;
            }

            count += 6 * i;
            result += 1;
            i++;
        }
        System.out.println(result);
    }
}
