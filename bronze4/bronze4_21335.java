import java.util.Scanner;

// Coding By 김용선.

public class bronze4_21335 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        double r = Math.sqrt(a / Math.PI);

        System.out.println(2 * Math.PI * r);
    }
}
