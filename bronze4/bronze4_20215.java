import java.util.Scanner;

// Coding By 김용선.

public class bronze4_20215 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double w = in.nextDouble();
        double h = in.nextDouble();

        double result1 = w + h;
        double result2 = Math.sqrt((w * w) + (h * h));

        System.out.println(result1 - result2);
    }
}
