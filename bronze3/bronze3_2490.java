import java.util.Scanner;

// Coding By 김용선.

public class bronze3_2490 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;
        int sum;
        for (int i = 0; i < 3; i++) {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();

            sum = a + b + c + d;

            if (sum == 3)
                System.out.println("A");
            else if (sum == 2)
                System.out.println("B");
            else if (sum == 1)
                System.out.println("C");
            else if (sum == 0)
                System.out.println("D");
            else if (sum == 4)
                System.out.println("E");
        }
    }
}
