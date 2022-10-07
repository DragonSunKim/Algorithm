import java.util.Scanner;

// Coding By 김용선.

public class bronze2_2747 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] numbers = { 0, 1 };

        int n = in.nextInt();
        int x;
        if (n == 0)
            numbers[1] = numbers[0];
        else {
            for (int i = 0; i <= n - 2; i++) {

                x = numbers[1];
                numbers[1] = numbers[0] + numbers[1];
                numbers[0] = x;

            }
        }
        System.out.println(numbers[1]);
    }
}
