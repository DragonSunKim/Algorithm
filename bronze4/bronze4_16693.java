import java.util.Scanner;

public class bronze4_16693 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double A1 = in.nextDouble();
        double P1 = in.nextDouble();
        double R1 = in.nextDouble();
        double P2 = in.nextDouble();

        double ans1 = A1 / P1;
        double ans2 = (R1 * R1 * 3.14159265359) / P2;

        System.out.print((ans1 > ans2) ? "Slice of pizza" : "Whole pizza");
    }
}
