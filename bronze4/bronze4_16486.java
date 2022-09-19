import java.util.Scanner;

public class bronze4_16486 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d1 = in.nextInt();
        int d2 = in.nextInt();

        double pi = 3.141592;
        double circle = 2 * pi * d2;
        System.out.print(circle + (d1 * 2));

    }
}
